/**
 * 
 */
package com.test.bit_i_know.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author pradeep
 *
 */
@XmlRootElement
@XmlType(propOrder = { "senderID", "receiverID", "controlNumber", "ackStatus", "group" })
public class Interchange {

	public Interchange() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param senderID
	 * @param receiverID
	 * @param controlNumber
	 * @param ackStatus
	 * @param group
	 */
	public Interchange(ElementWithTagAttribute senderID, ElementWithTagAttribute receiverID,
			ElementWithTagAttribute controlNumber, String ackStatus, Group group) {
		super();
		this.senderID = senderID;
		this.receiverID = receiverID;
		this.controlNumber = controlNumber;
		this.ackStatus = ackStatus;
		this.group = group;
	}

	private ElementWithTagAttribute senderID;
	private ElementWithTagAttribute receiverID;
	private ElementWithTagAttribute controlNumber;
	private String ackStatus;
	private Group group;

	/**
	 * @return the group
	 */
	@XmlElement(name = "Group")
	public final Group getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public final void setGroup(Group group) {
		this.group = group;
	}

	/**
	 * @return the ackStatus
	 */
	@XmlElement(name = "AckStatus")
	public final String getAckStatus() {
		return ackStatus;
	}

	/**
	 * @param ackStatus
	 *            the ackStatus to set
	 */
	public final void setAckStatus(String ackStatus) {
		this.ackStatus = ackStatus;
	}

	/**
	 * @return the controlNumber
	 */
	@XmlElement(name = "ControlNumber")
	public final ElementWithTagAttribute getControlNumber() {
		return controlNumber;
	}

	/**
	 * @param controlNumber
	 *            the controlNumber to set
	 */
	public final void setControlNumber(ElementWithTagAttribute controlNumber) {
		this.controlNumber = controlNumber;
	}

	/**
	 * @return the receiverID
	 */
	@XmlElement(name = "ReceiverID")
	public final ElementWithTagAttribute getReceiverID() {
		return receiverID;
	}

	/**
	 * @param receiverID
	 *            the receiverID to set
	 */
	public final void setReceiverID(ElementWithTagAttribute receiverID) {
		this.receiverID = receiverID;
	}

	/**
	 * @return the senderID
	 */
	@XmlElement(name = "SenderID")
	public final ElementWithTagAttribute getSenderID() {
		return senderID;
	}

	/**
	 * @param senderID
	 *            the senderID to set
	 */
	public final void setSenderID(ElementWithTagAttribute senderID) {
		this.senderID = senderID;
	}

	public static class ElementWithTagAttribute {
		private String tag;
		private String value;

		public ElementWithTagAttribute() {
		}

		public ElementWithTagAttribute(String thisAtt, String value) {
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
