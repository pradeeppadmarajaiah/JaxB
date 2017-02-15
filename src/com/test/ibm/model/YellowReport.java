package com.test.ibm.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "yellowReport")
@XmlType(propOrder = { "externalReferenceId", "externalScheduleId", "businessAlias", "businessAliasName", "reportName",
		"contactsList", "fromEmailId", "emailSubject", "documentType", "directionCode", "receiverId", "senderId",
		"notificationAction", "holdType", "lookBackInMins", "threshold", "reportDeliveryFormats",
		"reportDeliveryMethods" })

public class YellowReport {
	public YellowReport() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param externalReferenceId
	 * @param externalScheduleId
	 * @param businessAlias
	 * @param businessAliasName
	 * @param reportName
	 * @param contactsList
	 * @param fromEmailId
	 * @param emailSubject
	 * @param documentType
	 * @param directionCode
	 * @param receiverId
	 * @param senderId
	 * @param notificationAction
	 * @param holdType
	 * @param lookBackInMins
	 * @param threshold
	 * @param reportDeliveryFormats
	 * @param reportDeliveryMethods
	 */
	public YellowReport(String externalReferenceId, String externalScheduleId, String businessAlias,
			String businessAliasName, String reportName, ContactsList contactsList, String fromEmailId,
			String emailSubject, String documentType, String directionCode, String receiverId, String senderId,
			String notificationAction, String holdType, String lookBackInMins, String threshold,
			List<ReportDeliveryFormats> reportDeliveryFormats, ReportDeliveryMethods reportDeliveryMethods) {
		super();
		this.externalReferenceId = externalReferenceId;
		this.externalScheduleId = externalScheduleId;
		this.businessAlias = businessAlias;
		this.businessAliasName = businessAliasName;
		this.reportName = reportName;
		this.contactsList = contactsList;
		this.fromEmailId = fromEmailId;
		this.emailSubject = emailSubject;
		this.documentType = documentType;
		this.directionCode = directionCode;
		this.receiverId = receiverId;
		this.senderId = senderId;
		this.notificationAction = notificationAction;
		this.holdType = holdType;
		this.lookBackInMins = lookBackInMins;
		this.threshold = threshold;
		this.reportDeliveryFormats = reportDeliveryFormats;
		this.reportDeliveryMethods = reportDeliveryMethods;
	}

	private String externalReferenceId;
	private String externalScheduleId;
	private String businessAlias;
	private String businessAliasName;
	private String reportName;
	private ContactsList contactsList;
	private String fromEmailId;
	private String emailSubject;
	private String documentType;
	private String directionCode;
	private String receiverId;
	private String senderId;
	private String notificationAction;
	private String holdType;
	private String lookBackInMins;
	private String threshold;
	private List<ReportDeliveryFormats> reportDeliveryFormats = new ArrayList<>();
	private ReportDeliveryMethods reportDeliveryMethods;

	/**
	 * @return the externalReferenceId
	 */
	@XmlElement(name = "ExternalReferenceId")
	public final String getExternalReferenceId() {
		return externalReferenceId;
	}

	/**
	 * @return the externalScheduleId
	 */
	@XmlElement(name = "ExternalScheduleId")
	public final String getExternalScheduleId() {
		return externalScheduleId;
	}

	/**
	 * @return the businessAlias
	 */
	@XmlElement(name = "BusinessAlias")
	public final String getBusinessAlias() {
		return businessAlias;
	}

	/**
	 * @return the businessAliasName
	 */
	@XmlElement(name = "BusinessAliasName")
	public final String getBusinessAliasName() {
		return businessAliasName;
	}

	/**
	 * @return the reportName
	 */
	@XmlElement(name = "ReportName")
	public final String getReportName() {
		return reportName;
	}

	/**
	 * @return the contactsList
	 */
	@XmlElement(name = "contactsList")
	public final ContactsList getContactsList() {
		return contactsList;
	}

	/**
	 * @return the fromEmailId
	 */
	@XmlElement(name = "FromEmailId")
	public final String getFromEmailId() {
		return fromEmailId;
	}

	/**
	 * @return the emailSubject
	 */
	@XmlElement(name = "EmailSubject")
	public final String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * @return the documentType
	 */
	@XmlElement(name = "DocumentType")
	public final String getDocumentType() {
		return documentType;
	}

	/**
	 * @return the directionCode
	 */
	@XmlElement(name = "DirectionCode")
	public final String getDirectionCode() {
		return directionCode;
	}

	/**
	 * @return the receiverId
	 */
	@XmlElement(name = "ReceiverId")
	public final String getReceiverId() {
		return receiverId;
	}

	/**
	 * @return the senderId
	 */
	@XmlElement(name = "SenderId")
	public final String getSenderId() {
		return senderId;
	}

	/**
	 * @return the notificationAction
	 */
	@XmlElement(name = "NotificationAction")
	public final String getNotificationAction() {
		return notificationAction;
	}

	/**
	 * @return the holdType
	 */
	@XmlElement(name = "HoldType")
	public final String getHoldType() {
		return holdType;
	}

	/**
	 * @return the lookBackInMins
	 */
	@XmlElement(name = "LookBackInMins")
	public final String getLookBackInMins() {
		return lookBackInMins;
	}

	/**
	 * @return the threshold
	 */
	@XmlElement(name = "ThresholdInMins")
	public final String getThreshold() {
		return threshold;
	}

	/**
	 * @return the reportDeliveryFormats
	 */
	@XmlElement(name = "reportDeliveryFormats")
	public final List<ReportDeliveryFormats> getReportDeliveryFormats() {
		return reportDeliveryFormats;
	}

	/**
	 * @return the reportDeliveryMethods
	 */
	@XmlElement(name = "reportDeliveryMethods")
	public final ReportDeliveryMethods getReportDeliveryMethods() {
		return reportDeliveryMethods;
	}

	/**
	 * @param externalReferenceId
	 *            the externalReferenceId to set
	 */
	public final void setExternalReferenceId(String externalReferenceId) {
		this.externalReferenceId = externalReferenceId;
	}

	/**
	 * @param externalScheduleId
	 *            the externalScheduleId to set
	 */
	public final void setExternalScheduleId(String externalScheduleId) {
		this.externalScheduleId = externalScheduleId;
	}

	/**
	 * @param businessAlias
	 *            the businessAlias to set
	 */
	public final void setBusinessAlias(String businessAlias) {
		this.businessAlias = businessAlias;
	}

	/**
	 * @param businessAliasName
	 *            the businessAliasName to set
	 */
	public final void setBusinessAliasName(String businessAliasName) {
		this.businessAliasName = businessAliasName;
	}

	/**
	 * @param reportName
	 *            the reportName to set
	 */
	public final void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * @param contactsList
	 *            the contactsList to set
	 */
	public final void setContactsList(ContactsList contactsList) {
		this.contactsList = contactsList;
	}

	/**
	 * @param fromEmailId
	 *            the fromEmailId to set
	 */
	public final void setFromEmailId(String fromEmailId) {
		this.fromEmailId = fromEmailId;
	}

	/**
	 * @param emailSubject
	 *            the emailSubject to set
	 */
	public final void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	/**
	 * @param documentType
	 *            the documentType to set
	 */
	public final void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * @param directionCode
	 *            the directionCode to set
	 */
	public final void setDirectionCode(String directionCode) {
		this.directionCode = directionCode;
	}

	/**
	 * @param receiverId
	 *            the receiverId to set
	 */
	public final void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	/**
	 * @param senderId
	 *            the senderId to set
	 */
	public final void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	/**
	 * @param notificationAction
	 *            the notificationAction to set
	 */
	public final void setNotificationAction(String notificationAction) {
		this.notificationAction = notificationAction;
	}

	/**
	 * @param holdType
	 *            the holdType to set
	 */
	public final void setHoldType(String holdType) {
		this.holdType = holdType;
	}

	/**
	 * @param lookBackInMins
	 *            the lookBackInMins to set
	 */
	public final void setLookBackInMins(String lookBackInMins) {
		this.lookBackInMins = lookBackInMins;
	}

	/**
	 * @param threshold
	 *            the threshold to set
	 */
	public final void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	/**
	 * @param reportDeliveryFormats
	 *            the reportDeliveryFormats to set
	 */
	public final void setReportDeliveryFormats(List<ReportDeliveryFormats> reportDeliveryFormats) {
		this.reportDeliveryFormats = reportDeliveryFormats;
	}

	/**
	 * @param reportDeliveryMethods
	 *            the reportDeliveryMethods to set
	 */
	public final void setReportDeliveryMethods(ReportDeliveryMethods reportDeliveryMethods) {
		this.reportDeliveryMethods = reportDeliveryMethods;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "YellowReport [externalReferenceId=" + externalReferenceId + ", externalScheduleId=" + externalScheduleId
				+ ", businessAlias=" + businessAlias + ", businessAliasName=" + businessAliasName + ", reportName="
				+ reportName + ", contactsList=" + contactsList + ", fromEmailId=" + fromEmailId + ", emailSubject="
				+ emailSubject + ", documentType=" + documentType + ", directionCode=" + directionCode + ", receiverId="
				+ receiverId + ", senderId=" + senderId + ", notificationAction=" + notificationAction + ", holdType="
				+ holdType + ", lookBackInMins=" + lookBackInMins + ", threshold=" + threshold
				+ ", reportDeliveryFormats=" + reportDeliveryFormats + ", reportDeliveryMethods="
				+ reportDeliveryMethods + "]";
	}

}
