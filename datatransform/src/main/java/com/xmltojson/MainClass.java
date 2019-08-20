package com.xmltojson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.json.JSONObject;

import com.xmltojson.entity.Coordinates;
import com.xmltojson.entity.Ev;
import com.xmltojson.entity.GeoJson;
import com.xmltojson.entity.Incident;
import com.xmltojson.entity.Location;
import com.xmltojson.entity.TmcJson;

public class MainClass {

	public static void main(String[] args) {
		try {
			// Reading the input xml and convert into object
			JAXBContext jaxbContext = JAXBContext.newInstance(Incident.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Incident incident = (Incident) jaxbUnmarshaller.unmarshal(new File("xml/incident.xml"));

			// Iterating through event class to set the values to Location
			List<Ev> evList = incident.getTi().getEv();
			
			List<Location> locations = new ArrayList<Location>();
			for (Ev eventCode : evList) {
				Location location = new Location();
				location.setId(String.valueOf(eventCode.getId()));
				location.setDescription(eventCode.getText());
				location.setEventCode(eventCode.getEc());
				location.setSeverity(eventCode.getSe());
				location.setType(eventCode.getLoc().getType());

				if ("geo".contentEquals(eventCode.getLoc().getType())) {
					GeoJson geo = new GeoJson();
					Coordinates coordinates = new Coordinates();
					coordinates.setLat(eventCode.getLoc().getGeo().getLat());
					coordinates.setLon(eventCode.getLoc().getGeo().getLon());
					geo.setCoordinates(coordinates);
					geo.setType(eventCode.getLoc().getType());
					location.setGeo(geo);

				} else if ("tmc".contentEquals(eventCode.getLoc().getType())) {
					TmcJson tmc = new TmcJson();
					tmc.setDirection(eventCode.getLoc().getStart().getDir());
					tmc.setId(eventCode.getLoc().getStart().getId());
					tmc.setTable(eventCode.getLoc().getStart().getOffset());
					location.setTmc(tmc);
				}

				location.setLastUpdated(eventCode.getValid().getEnd());
				location.setValidStart(eventCode.getValid().getStart());
				location.setValidEnd(eventCode.getValid().getEnd());

				locations.add(location);
			}

			if (locations.isEmpty()) {
				System.out.println("Unable to process the given input xml");
			} else {
				JSONObject jSONObject = new JSONObject();
				jSONObject.put("locations", locations);
				System.out.println(jSONObject.toString());
			}

		} catch (Exception e) {
			System.out.println("Unable to process the given input xml");
		}

	}

}
