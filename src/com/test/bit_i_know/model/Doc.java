package com.test.bit_i_know.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "documentCode", "documentType", "receiverID", "senderID", "bytes", "documentDate", "ackStatus",
		"ackExpiration", "documentReferenceNumbers", "functionalAcknowledgment" })
public class Doc {
	public Doc() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param documentCode
	 * @param documentType
	 * @param receiverID
	 * @param senderID
	 * @param bytes
	 * @param documentDate
	 * @param ackStatus
	 * @param ackExpiration
	 * @param documentReferenceNumbers
	 * @param functionalAcknowledgment
	 */
	public Doc(String documentCode, String documentType, String receiverID, String senderID, String bytes,
			String documentDate, String ackStatus, long ackExpiration,
			DocumentReferenceNumbers documentReferenceNumbers, FunctionalAcknowledgment functionalAcknowledgment) {
		super();
		this.documentCode = documentCode;
		this.documentType = documentType;
		this.receiverID = receiverID;
		this.senderID = senderID;
		this.bytes = bytes;
		this.documentDate = documentDate;
		this.ackStatus = ackStatus;
		this.ackExpiration = ackExpiration;
		this.documentReferenceNumbers = documentReferenceNumbers;
		this.functionalAcknowledgment = functionalAcknowledgment;
	}

	private String documentCode;
	private String documentType;
	private String receiverID;
	private String senderID;
	private String bytes;
	private String documentDate;
	private String ackStatus;
	private long ackExpiration;
	private DocumentReferenceNumbers documentReferenceNumbers;
	private FunctionalAcknowledgment functionalAcknowledgment;

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
	 * @return the ackExpiration
	 */
	@XmlElement(name = "AckExpiration")
	public final long getAckExpiration() {
		return ackExpiration;
	}

	/**
	 * @param ackExpiration
	 *            the ackExpiration to set
	 */
	public final void setAckExpiration(long ackExpiration) {
		this.ackExpiration = ackExpiration;
	}

	/**
	 * @return the functionalAcknowledgment
	 */
	@XmlElement(name = "FunctionalAcknowledgment")
	public final FunctionalAcknowledgment getFunctionalAcknowledgment() {
		return functionalAcknowledgment;
	}

	/**
	 * @param functionalAcknowledgment
	 *            the functionalAcknowledgment to set
	 */
	public final void setFunctionalAcknowledgment(FunctionalAcknowledgment functionalAcknowledgment) {
		this.functionalAcknowledgment = functionalAcknowledgment;
	}

	/**
	 * @return the documentCode
	 */
	@XmlElement(name = "DocumentCode")
	public final String getDocumentCode() {
		return documentCode;
	}

	/**
	 * @return the documentType
	 */
	@XmlElement(name = "DocumentType")
	public final String getDocumentType() {
		return documentType;
	}

	/**
	 * @return the receiverID
	 */
	@XmlElement(name = "ReceiverID")
	public final String getReceiverID() {
		return receiverID;
	}

	/**
	 * @return the senderID
	 */
	@XmlElement(name = "SenderID")
	public final String getSenderID() {
		return senderID;
	}

	/**
	 * @return the bytes
	 */
	@XmlElement(name = "Bytes")
	public final String getBytes() {
		return bytes;
	}

	/**
	 * @return the documentDate
	 */
	@XmlElement(name = "DocumentDate")
	public final String getDocumentDate() {
		return documentDate;
	}

	/**
	 * @return the documentReferenceNumbers
	 */
	@XmlElement(name = "DocumentReferenceNumbers")
	public final DocumentReferenceNumbers getDocumentReferenceNumbers() {
		return documentReferenceNumbers;
	}

	/**
	 * @param documentCode
	 *            the documentCode to set
	 */
	public final void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	/**
	 * @param documentType
	 *            the documentType to set
	 */
	public final void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * @param receiverID
	 *            the receiverID to set
	 */
	public final void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}

	/**
	 * @param senderID
	 *            the senderID to set
	 */
	public final void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	/**
	 * @param bytes
	 *            the bytes to set
	 */
	public final void setBytes(String bytes) {
		this.bytes = bytes;
	}

	/**
	 * @param documentDate
	 *            the documentDate to set
	 */
	public final void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}

	/**
	 * @param documentReferenceNumbers
	 *            the documentReferenceNumbers to set
	 */
	public final void setDocumentReferenceNumbers(DocumentReferenceNumbers documentReferenceNumbers) {
		this.documentReferenceNumbers = documentReferenceNumbers;
	}

}
