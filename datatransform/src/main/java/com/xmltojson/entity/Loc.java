package com.xmltojson.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "loc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Loc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5537700054842836664L;
	@XmlAttribute
	String type;

	String addr;
	Geo geo;
	Start start;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}
	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

}
