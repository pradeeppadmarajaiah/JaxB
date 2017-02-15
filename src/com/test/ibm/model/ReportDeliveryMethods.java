package com.test.ibm.model;

import javax.xml.bind.annotation.XmlElement;


public class ReportDeliveryMethods {
	public ReportDeliveryMethods() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * <reportDeliveryMethods> <DeliveryMethod>SMTP</DeliveryMethod>
	 * </reportDeliveryMethods>
	 */
	private String deliveryMethod;

	/**
	 * @return the deliveryMethod
	 */
	@XmlElement(name = "DeliveryMethod")
	public final String getDeliveryMethod() {
		return deliveryMethod;
	}

	/**
	 * @param deliveryMethod
	 *            the deliveryMethod to set
	 */
	public final void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public ReportDeliveryMethods(String deliveryMethod) {
		super();
		this.deliveryMethod = deliveryMethod;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReportDeliveryMethods [deliveryMethod=" + deliveryMethod + "]";
	}

}
