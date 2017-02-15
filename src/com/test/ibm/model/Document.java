package com.test.ibm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ProcessEvent")
@XmlType(propOrder = { "mode", "eventCode", "parentEventCodes", "statusCode", "directionCode", "statusCodeIsFinal",
		"trackingPointID", "system", "eventTime", "eventDetail", "eventDetailI18n", "eventDetails0", "eventDetails1",
		"senderAlias", "fileSize", "filename", "fileGuid", "charSet", "isDocumentEvent", "sourceBatchID", "document",
		"fileData" })
public class Document {

	public Document() {
		// TODO Auto-generated constructor stub
	}

	private String mode;
	private String eventCode;
	private ParentEventCodes parentEventCodes;
	private String statusCode;
	private String statusCodeIsFinal;
	private String trackingPointID;
	private String system;
	private String eventTime;
	private String eventDetail;
	private String eventDetailI18n;
	private String eventDetails0;
	private String eventDetails1;
	private String senderAlias;
	private String fileSize;
	private String filename;
	private String fileGuid;
	private String charSet;
	private String isDocumentEvent;
	private String sourceBatchID;
	private String directionCode;
	private Doc document;
	private String fileData;

	/**
	 * @return the charSet
	 */
	@XmlElement(name = "CharSet")
	public final String getCharSet() {
		return charSet;
	}

	/**
	 * @param charSet
	 *            the charSet to set
	 */
	public final void setCharSet(String charSet) {
		this.charSet = charSet;
	}

	/**
	 * @return the sourceBatchID
	 */
	@XmlElement(name = "SourceBatchID")
	public final String getSourceBatchID() {
		return sourceBatchID;
	}

	/**
	 * @param sourceBatchID
	 *            the sourceBatchID to set
	 */
	public final void setSourceBatchID(String sourceBatchID) {
		this.sourceBatchID = sourceBatchID;
	}

	/**
	 * @return the fileGuid
	 */
	@XmlElement(name = "FileGuid")
	public final String getFileGuid() {
		return fileGuid;
	}

	/**
	 * @param fileGuid
	 *            the fileGuid to set
	 */
	public final void setFileGuid(String fileGuid) {
		this.fileGuid = fileGuid;
	}

	/**
	 * @return the eventDetailI18n
	 */
	@XmlElement(name = "EventDetailI18n")
	public final String getEventDetailI18n() {
		return eventDetailI18n;
	}

	/**
	 * @param eventDetailI18n
	 *            the eventDetailI18n to set
	 */
	public final void setEventDetailI18n(String eventDetailI18n) {
		this.eventDetailI18n = eventDetailI18n;
	}

	/**
	 * @return the eventDetails0
	 */

	@XmlElement(name = "EventDetails0")
	public final String getEventDetails0() {
		return eventDetails0;
	}

	/**
	 * @param eventDetails0
	 *            the eventDetails0 to set
	 */
	public final void setEventDetails0(String eventDetails0) {
		this.eventDetails0 = eventDetails0;
	}

	/**
	 * @return the eventDetails1
	 */
	public final String getEventDetails1() {
		return eventDetails1;
	}

	/**
	 * @param eventDetails1
	 *            the eventDetails1 to set
	 */
	@XmlElement(name = "EventDetails1")
	public final void setEventDetails1(String eventDetails1) {
		this.eventDetails1 = eventDetails1;
	}

	/**
	 * @return the mode
	 */
	@XmlElement(name = "Mode")
	public final String getMode() {
		return mode;
	}

	/**
	 * @return the eventCode
	 */
	@XmlElement(name = "EventCode")
	public final String getEventCode() {
		return eventCode;
	}

	/**
	 * @return the parentEventCodes
	 */
	@XmlElement(name = "ParentEventCodes")
	public final ParentEventCodes getParentEventCodes() {
		return parentEventCodes;
	}

	/**
	 * @return the statusCode
	 */
	@XmlElement(name = "StatusCode")
	public final String getStatusCode() {
		return statusCode;
	}

	/**
	 * @return the statusCodeIsFinal
	 */
	@XmlElement(name = "StatusCodeIsFinal")
	public final String getStatusCodeIsFinal() {
		return statusCodeIsFinal;
	}

	/**
	 * @return the trackingPointID
	 */
	@XmlElement(name = "TrackingPointID")
	public final String getTrackingPointID() {
		return trackingPointID;
	}

	/**
	 * @return the system
	 */
	@XmlElement(name = "System")
	public final String getSystem() {
		return system;
	}

	/**
	 * @return the eventTime
	 */
	@XmlElement(name = "EventTime")
	public final String getEventTime() {
		return eventTime;
	}

	/**
	 * @return the eventDetail
	 */
	@XmlElement(name = "EventDetail")
	public final String getEventDetail() {
		return eventDetail;
	}

	/**
	 * @return the senderAlias
	 */
	@XmlElement(name = "SenderAlias")
	public final String getSenderAlias() {
		return senderAlias;
	}

	/**
	 * @return the fileSize
	 */
	@XmlElement(name = "FileSize")
	public final String getFileSize() {
		return fileSize;
	}

	/**
	 * @return the filename
	 */
	@XmlElement(name = "Filename")
	public final String getFilename() {
		return filename;
	}

	/**
	 * @return the isDocumentEvent
	 */
	@XmlElement(name = "IsDocumentEvent")
	public final String getIsDocumentEvent() {
		return isDocumentEvent;
	}

	/**
	 * @return the directionCode
	 */
	@XmlElement(name = "DirectionCode")
	public final String getDirectionCode() {
		return directionCode;
	}

	/**
	 * @return the document
	 */
	@XmlElement(name = "Document")
	public final Doc getDocument() {
		return document;
	}

	/**
	 * @return the fileData
	 */
	@XmlElement(name = "FileData")
	public final String getFileData() {
		return fileData;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public final void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param eventCode
	 *            the eventCode to set
	 */
	public final void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	/**
	 * @param parentEventCodes
	 *            the parentEventCodes to set
	 */
	public final void setParentEventCodes(ParentEventCodes parentEventCodes) {
		this.parentEventCodes = parentEventCodes;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public final void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @param statusCodeIsFinal
	 *            the statusCodeIsFinal to set
	 */
	public final void setStatusCodeIsFinal(String statusCodeIsFinal) {
		this.statusCodeIsFinal = statusCodeIsFinal;
	}

	/**
	 * @param trackingPointID
	 *            the trackingPointID to set
	 */
	public final void setTrackingPointID(String trackingPointID) {
		this.trackingPointID = trackingPointID;
	}

	/**
	 * @param system
	 *            the system to set
	 */
	public final void setSystem(String system) {
		this.system = system;
	}

	/**
	 * @param eventTime
	 *            the eventTime to set
	 */
	public final void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * @param eventDetail
	 *            the eventDetail to set
	 */
	public final void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	/**
	 * @param senderAlias
	 *            the senderAlias to set
	 */
	public final void setSenderAlias(String senderAlias) {
		this.senderAlias = senderAlias;
	}

	/**
	 * @param fileSize
	 *            the fileSize to set
	 */
	public final void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public final void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @param isDocumentEvent
	 *            the isDocumentEvent to set
	 */
	public final void setIsDocumentEvent(String isDocumentEvent) {
		this.isDocumentEvent = isDocumentEvent;
	}

	/**
	 * @param directionCode
	 *            the directionCode to set
	 */
	public final void setDirectionCode(String directionCode) {
		this.directionCode = directionCode;
	}

	/**
	 * @param document
	 *            the document to set
	 */
	public final void setDocument(Doc document) {
		this.document = document;
	}

	/**
	 * @param fileData
	 *            the fileData to set
	 */
	public final void setFileData(String fileData) {
		this.fileData = fileData;
	}

}
