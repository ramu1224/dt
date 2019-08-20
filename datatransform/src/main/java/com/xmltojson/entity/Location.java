package com.xmltojson.entity;

import java.util.Date;

public class Location {
	
	String id;
	String description;
	GeoJson geo;
	TmcJson tmc;
	String roadName;
	int eventCode;
	int severity;
	Date validStart;
	Date validEnd;
	String type;
	Date lastUpdated;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GeoJson getGeo() {
		return geo;
	}
	public void setGeo(GeoJson geo) {
		this.geo = geo;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public int getEventCode() {
		return eventCode;
	}
	public void setEventCode(int eventCode) {
		this.eventCode = eventCode;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public TmcJson getTmc() {
		return tmc;
	}
	public void setTmc(TmcJson tmc) {
		this.tmc = tmc;
	}
	public Date getValidStart() {
		return validStart;
	}
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}
	public Date getValidEnd() {
		return validEnd;
	}
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
}
