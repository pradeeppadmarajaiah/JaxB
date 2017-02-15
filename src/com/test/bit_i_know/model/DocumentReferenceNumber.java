package com.test.bit_i_know.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "DocumentReferenceNumber")
public class DocumentReferenceNumber {

	
	private String type;

	
	private String value;

	public DocumentReferenceNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the type
	 */
	@XmlAttribute(name = "type")
	public final String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the value
	 */
	@XmlValue
	public final String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public final void setValue(String value) {
		this.value = value;
	}

	/**
	 * @param type
	 * @param value
	 */
	public DocumentReferenceNumber(String type, String value) {
		super();
		this.type = type;
		this.value = value;
	}

}
