package com.xmltojson.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tmc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Start implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2842647253896654500L;
	@XmlAttribute
	int id;
	@XmlAttribute
	String dir;
	@XmlAttribute
	int offset;
	@XmlAttribute
	int extent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getExtent() {
		return extent;
	}

	public void setExtent(int extent) {
		this.extent = extent;
	}

}
