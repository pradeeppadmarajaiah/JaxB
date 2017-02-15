/**
 * 
 */
package com.test.bit_i_know.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author pradeep
 *
 */
public class ParentEventCodes {
	public ParentEventCodes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parentEventCode
	 */
	public ParentEventCodes(String parentEventCode) {
		super();
		this.parentEventCode = parentEventCode;
	}

	private String parentEventCode;

	/**
	 * @return the parentEventCode
	 */
	@XmlElement(name = "ParentEventCode")
	public final String getParentEventCode() {
		return parentEventCode;
	}

	/**
	 * @param parentEventCode
	 *            the parentEventCode to set
	 */
	public final void setParentEventCode(String parentEventCode) {
		this.parentEventCode = parentEventCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParentEventCodes [parentEventCode=" + parentEventCode + "]";
	}

}
