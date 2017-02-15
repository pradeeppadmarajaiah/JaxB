/**
 * 
 */
package com.test.ibm.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author pradeep
 *
 */
@XmlRootElement(name = "acknowledgementReport")
@XmlType(propOrder = { "externalReferenceId", "externalScheduleId", "businessAlias", "businessAliasName","reportName",
		"contactsList", "fromEmailId", "emailSubject", "documentType", "directionCode", "receiverId", "senderId",
		"notificationAction", "ackType", "lookBackInMins", "reportDeliveryFormats", "reportDeliveryMethods" })
public class AcknowledgementReport {

	public AcknowledgementReport() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * <acknowledgementReport>
	 * <ExternalReferenceId>d9a49d55-0dab-41bd-8d5c-2f0f7dd7fabc</
	 * ExternalReferenceId>
	 * <ExternalScheduleId>AcknowledgementSchedule</ExternalScheduleId>
	 * <BusinessAlias>STERLING_TMS</BusinessAlias>
	 * <BusinessAliasName>STERLING_TMS</BusinessAliasName>
	 * <ReportName>ACKREPORTNAME</ReportName> <contactsList>
	 * <EmailId>vmutcher@in.ibm.com</EmailId> <Timezone>IST</Timezone>
	 * <RecipientType>TO</RecipientType> </contactsList>
	 * <FromEmailId>noreply@in.ibm.com</FromEmailId>
	 * <EmailSubject>AckReport</EmailSubject> <DocumentType>997</DocumentType>
	 * <DirectionCode>1</DirectionCode> <ReceiverId>Rec</ReceiverId>
	 * <SenderId>Sen</SenderId>
	 * <NotificationAction>MARK_REVIEWED_AND_SEND_NOTIFICATION</
	 * NotificationAction> <AckType>OVERDUE</AckType>
	 * <LookBackInMins>1440</LookBackInMins> <reportDeliveryFormats>
	 * <DeliveryFormat>Text</DeliveryFormat> <DeliveryType>BODY</DeliveryType>
	 * </reportDeliveryFormats> <reportDeliveryFormats>
	 * <DeliveryFormat>CSV</DeliveryFormat>
	 * <DeliveryType>ATTACHMENT</DeliveryType> </reportDeliveryFormats>
	 * <reportDeliveryMethods> <DeliveryMethod>SMTP</DeliveryMethod>
	 * </reportDeliveryMethods> </acknowledgementReport>
	 */
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
	private String ackType;
	private String lookBackInMins;
	private List<ReportDeliveryFormats> reportDeliveryFormats=new ArrayList<>();
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
	 * @return the ackType
	 */
	@XmlElement(name = "AckType")
	public final String getAckType() {
		return ackType;
	}

	/**
	 * @return the lookBackInMins
	 */
	@XmlElement(name = "LookBackInMins")
	public final String getLookBackInMins() {
		return lookBackInMins;
	}

	/**
	 * @return the reportDeliveryFormats
	 */
	
	
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
	 * @param ackType
	 *            the ackType to set
	 */
	public final void setAckType(String ackType) {
		this.ackType = ackType;
	}

	/**
	 * @param lookBackInMins
	 *            the lookBackInMins to set
	 */
	public final void setLookBackInMins(String lookBackInMins) {
		this.lookBackInMins = lookBackInMins;
	}

	

	/**
	 * @return the reportDeliveryFormats
	 */
	@XmlElement(name = "reportDeliveryFormats")
	public final List<ReportDeliveryFormats> getReportDeliveryFormats() {
		return reportDeliveryFormats;
	}

	/**
	 * @param reportDeliveryFormats the reportDeliveryFormats to set
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

}
