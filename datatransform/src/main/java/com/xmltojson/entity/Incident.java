package com.xmltojson.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "incident")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Incident implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2969754203764089544L;
	Ti ti;

	public Ti getTi() {
		return ti;
	}

	public void setTi(Ti ti) {
		this.ti = ti;
	}
	

}
