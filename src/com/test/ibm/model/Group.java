package com.test.ibm.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlType(propOrder = { "gSenderID", "gReceiverID", "gControlNumber", "gAckStatus", "transaction" })
public class Group {

	/**
	 * @param gSenderID
	 * @param gReceiverID
	 * @param gControlNumber
	 * @param gAckStatus
	 * @param transaction
	 */
	public Group(GroupElementWithTagAttribute gSenderID, GroupElementWithTagAttribute gReceiverID,
			GroupElementWithTagAttribute gControlNumber, String gAckStatus, Transaction transaction) {
		super();
		this.gSenderID = gSenderID;
		this.gReceiverID = gReceiverID;
		this.gControlNumber = gControlNumber;
		this.gAckStatus = gAckStatus;
		this.transaction = transaction;
	}

	/**
	 * @param gSenderID
	 *            the gSenderID to set
	 */
	public final void setgSenderID(GroupElementWithTagAttribute gSenderID) {
		this.gSenderID = gSenderID;
	}

	/**
	 * @param gReceiverID
	 *            the gReceiverID to set
	 */
	public final void setgReceiverID(GroupElementWithTagAttribute gReceiverID) {
		this.gReceiverID = gReceiverID;
	}

	/**
	 * @param gControlNumber
	 *            the gControlNumber to set
	 */
	public final void setgControlNumber(GroupElementWithTagAttribute gControlNumber) {
		this.gControlNumber = gControlNumber;
	}

	/**
	 * @param gAckStatus
	 *            the gAckStatus to set
	 */
	public final void setgAckStatus(String gAckStatus) {
		this.gAckStatus = gAckStatus;
	}

	public Group() {
		// TODO Auto-generated constructor stub
	}

	private GroupElementWithTagAttribute gSenderID;
	private GroupElementWithTagAttribute gReceiverID;
	private GroupElementWithTagAttribute gControlNumber;
	private String gAckStatus;
	private Transaction transaction;

	/**
	 * @return the transaction
	 */

	@XmlElement(name = "Transaction")
	public final Transaction getTransaction() {
		return transaction;
	}

	/**
	 * @param transaction
	 *            the transaction to set
	 */
	public final void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	/**
	 * @return the gSenderID
	 */
	@XmlElement(name = "SenderID")
	public final GroupElementWithTagAttribute getgSenderID() {
		return gSenderID;
	}

	/**
	 * @return the gReceiverID
	 */
	@XmlElement(name = "ReceiverID")
	public final GroupElementWithTagAttribute getgReceiverID() {
		return gReceiverID;
	}

	/**
	 * @return the gControlNumber
	 */
	@XmlElement(name = "ControlNumber")
	public final GroupElementWithTagAttribute getgControlNumber() {
		return gControlNumber;
	}

	/**
	 * @return the gAckStatus
	 */
	@XmlElement(name = "AckStatus")
	public final String getgAckStatus() {
		return gAckStatus;
	}

	public static class GroupElementWithTagAttribute {
		private String tag;
		private String value;

		public GroupElementWithTagAttribute() {
		}

		public GroupElementWithTagAttribute(String thisAtt, String value) {
			this.tag = thisAtt;
			this.value = value;
		}

		@XmlAttribute(name = "tag")
		public String getThisAtt() {
			return tag;
		}

		public void setThisAtt(String thisAtt) {
			this.tag = thisAtt;
		}

		@XmlValue
		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

}
