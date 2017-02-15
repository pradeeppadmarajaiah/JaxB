package com.test.ibm.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class FunctionalAcknowledgment {

	public FunctionalAcknowledgment() {
		// TODO Auto-generated constructor stub
	}

	private Interchange interchange;

	/**
	 * @return the interchange
	 */
	@XmlElement(name = "Interchange")
	public final Interchange getInterchange() {
		return interchange;
	}

	/**
	 * @param interchange
	 *            the interchange to set
	 */
	public final void setInterchange(Interchange interchange) {
		this.interchange = interchange;
	}

	/**
	 * @param interchange
	 */
	public FunctionalAcknowledgment(Interchange interchange) {
		super();
		this.interchange = interchange;
	}

}
