package com.xmltojson.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "valid")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Valid implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8336158468891162557L;
	Date start;
	Date end;
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	

}
