package com.xmltojson.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "geo")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Geo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8917248638855312754L;
	double lon;
	double lat;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}

}
