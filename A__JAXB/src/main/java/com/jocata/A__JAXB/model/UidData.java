package com.jocata.A__JAXB.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UidData")
@XmlAccessorType(XmlAccessType.FIELD)
public class UidData {
	
	@XmlElement(name="Poi")
	private String Poi;
	@XmlElement(name="Poa")
	private String Poa;
	@XmlElement(name="Pht")
	private String Pht;
	
	public String getPoi() {
		return Poi;
	}
	public void setPoi(String poi) {
		Poi = poi;
	}
	public String getPoa() {
		return Poa;
	}
	public void setPoa(String poa) {
		Poa = poa;
	}
	public String getPht() {
		return Pht;
	}
	public void setPht(String pht) {
		Pht = pht;
	}
	
	
}
