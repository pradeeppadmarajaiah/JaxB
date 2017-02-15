package com.test.bit_i_know.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"deliveryFormat", "deliveryType"})
public class ReportDeliveryFormats {

	public ReportDeliveryFormats() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param deliveryFormat
	 * @param deliveryType
	 */
	public ReportDeliveryFormats(String deliveryFormat, String deliveryType) {
		super();
		this.deliveryFormat = deliveryFormat;
		this.deliveryType = deliveryType;
	}

	/*
	 * <reportDeliveryFormats> <DeliveryFormat>CSV</DeliveryFormat>
	 * <DeliveryType>ATTACHMENT</DeliveryType> </reportDeliveryFormats>
	 */

	private String deliveryFormat;
	private String deliveryType;

	/**
	 * @return the deliveryFormat
	 */
	@XmlElement(name = "DeliveryFormat")
	public final String getDeliveryFormat() {
		return deliveryFormat;
	}

	/**
	 * @param deliveryFormat
	 *            the deliveryFormat to set
	 */
	public final void setDeliveryFormat(String deliveryFormat) {
		this.deliveryFormat = deliveryFormat;
	}

	/**
	 * @return the deliveryType
	 */
	@XmlElement(name = "DeliveryType")
	public final String getDeliveryType() {
		return deliveryType;
	}

	/**
	 * @param deliveryType
	 *            the deliveryType to set
	 */
	public final void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReportDeliveryFormats [deliveryFormat=" + deliveryFormat + ", deliveryType=" + deliveryType + "]";
	}

}
