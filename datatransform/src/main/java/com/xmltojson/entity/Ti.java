package com.xmltojson.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ti")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Ti implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6387636725426490853L;
	int table;
	String tv;
	String fv;
	Date at;
	List<Ev> ev;

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}

	public String getTv() {
		return tv;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	public String getFv() {
		return fv;
	}

	public void setFv(String fv) {
		this.fv = fv;
	}

	public Date getAt() {
		return at;
	}

	public void setAt(Date at) {
		this.at = at;
	}

	public List<Ev> getEv() {
		return ev;
	}

	public void setEv(List<Ev> ev) {
		this.ev = ev;
	}

}
