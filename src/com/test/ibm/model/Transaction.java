package com.test.ibm.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class Transaction {
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionSetID
	 * @param controlNumber
	 * @param ackStatus
	 */
	public Transaction(TransactionElementWithTagAttribute transactionSetID,
			TransactionElementWithTagAttribute controlNumber, String ackStatus) {
		super();
		this.transactionSetID = transactionSetID;
		this.controlNumber = controlNumber;
		this.ackStatus = ackStatus;
	}

	private TransactionElementWithTagAttribute transactionSetID;
	private TransactionElementWithTagAttribute controlNumber;
	private String ackStatus;

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
	public final TransactionElementWithTagAttribute getControlNumber() {
		return controlNumber;
	}

	/**
	 * @param controlNumber
	 *            the controlNumber to set
	 */
	public final void setControlNumber(TransactionElementWithTagAttribute controlNumber) {
		this.controlNumber = controlNumber;
	}

	/**
	 * @return the transactionSetID
	 */
	@XmlElement(name = "TransactionSetID")
	public final TransactionElementWithTagAttribute getTransactionSetID() {
		return transactionSetID;
	}

	/**
	 * @param transactionSetID
	 *            the transactionSetID to set
	 */
	public final void setTransactionSetID(TransactionElementWithTagAttribute transactionSetID) {
		this.transactionSetID = transactionSetID;
	}

	public static class TransactionElementWithTagAttribute {
		private String tag;
		private String value;

		public TransactionElementWithTagAttribute() {
		}

		public TransactionElementWithTagAttribute(String thisAtt, String value) {
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
