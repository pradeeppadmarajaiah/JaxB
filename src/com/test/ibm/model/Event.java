package com.test.ibm.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ProcessEvent")
@XmlType(propOrder = { "mode", "eventCode", "parentEventCodes", "statusCode", "statusCodeIsFinal", "trackingPointID",
		"system", "eventTime", "eventDetail", "senderAlias", "fileSize", "filename", "isDocumentEvent", "directionCode",
		"fileData" })
public class Event {

	public Event() {
		// TODO Auto-generated constructor stub
	}

	private String mode;
	private String eventCode;
	private String parentEventCodes;
	private String statusCode;
	private String statusCodeIsFinal;
	private String trackingPointID;
	private String system;
	private String eventTime;
	private String eventDetail;
	private String senderAlias;
	private String fileSize;
	private String filename;
	private String isDocumentEvent;
	private String directionCode;
	private String fileData;

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
	 * 
	 * @return the parentEventCodes
	 */
	@XmlElement(name = "ParentEventCodes")
	public final String getParentEventCodes() {
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
	public final void setParentEventCodes(String parentEventCodes) {
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
	 * @param fileData
	 *            the fileData to set
	 */
	public final void setFileData(String fileData) {
		this.fileData = fileData;
	}

	/**
	 * @param mode
	 * @param eventCode
	 * @param parentEventCodes
	 * @param statusCode
	 * @param statusCodeIsFinal
	 * @param trackingPointID
	 * @param system
	 * @param eventTime
	 * @param eventDetail
	 * @param senderAlias
	 * @param fileSize
	 * @param filename
	 * @param isDocumentEvent
	 * @param directionCode
	 * @param fileData
	 */
	public Event(String mode, String eventCode, String parentEventCodes, String statusCode, String statusCodeIsFinal,
			String trackingPointID, String system, String eventTime, String eventDetail, String senderAlias,
			String fileSize, String filename, String isDocumentEvent, String directionCode, String fileData) {
		super();
		this.mode = mode;
		this.eventCode = eventCode;
		this.parentEventCodes = parentEventCodes;
		this.statusCode = statusCode;
		this.statusCodeIsFinal = statusCodeIsFinal;
		this.trackingPointID = trackingPointID;
		this.system = system;
		this.eventTime = eventTime;
		this.eventDetail = eventDetail;
		this.senderAlias = senderAlias;
		this.fileSize = fileSize;
		this.filename = filename;
		this.isDocumentEvent = isDocumentEvent;
		this.directionCode = directionCode;
		this.fileData = fileData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Event [mode=" + mode + ", eventCode=" + eventCode + ", parentEventCodes=" + parentEventCodes
				+ ", statusCode=" + statusCode + ", statusCodeIsFinal=" + statusCodeIsFinal + ", trackingPointID="
				+ trackingPointID + ", system=" + system + ", eventTime=" + eventTime + ", eventDetail=" + eventDetail
				+ ", senderAlias=" + senderAlias + ", fileSize=" + fileSize + ", filename=" + filename
				+ ", isDocumentEvent=" + isDocumentEvent + ", directionCode=" + directionCode + ", fileData=" + fileData
				+ "]";
	}

}
