package com.test.ibm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"emailId", "timezone","recipientType"})
public class ContactsList {
	public ContactsList() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * <contactsList> <EmailId>vmutcher@in.ibm.com</EmailId>
	 * <Timezone>IST</Timezone> <RecipientType>TO</RecipientType>
	 * </contactsList>
	 */

	private String emailId;
	private String timezone;
	private String recipientType;

	/**
	 * @return the emailId
	 */
	@XmlElement(name = "EmailId")
	public final String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public final void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the timezone
	 */
	@XmlElement(name = "Timezone")
	public final String getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone
	 *            the timezone to set
	 */
	public final void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the recipientType
	 */
	@XmlElement(name = "RecipientType")
	public final String getRecipientType() {
		return recipientType;
	}

	/**
	 * @param recipientType
	 *            the recipientType to set
	 */
	public final void setRecipientType(String recipientType) {
		this.recipientType = recipientType;
	}

}
