package com.test.bit_i_know.util;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.test.bit_i_know.data.AckType;
import com.test.bit_i_know.data.NotificationAction;
import com.test.bit_i_know.model.AcknowledgementReport;
import com.test.bit_i_know.model.ContactsList;
import com.test.bit_i_know.model.ReportDeliveryFormats;
import com.test.bit_i_know.model.ReportDeliveryMethods;

/**
 * 
 * @author pradeep
 *
 */
public class AcknowledgementReportGeneration {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 1; i++) {
			String fileName = "AcknowledgementReport_" + i + ".xml";
			String externalReferenceId = "ERID" + i;
			String receiverId = "Rec" + i;
			int ackTypeS = 0;
			AckType ackType = (ackTypeS == 0) ? AckType.OVERDUE : AckType.NEGATIVE;
			executor.execute(() -> {
				AcknowledgementReport acknowledgementReport = getAckTestData(externalReferenceId, receiverId, ackType);
				jaxbObjectToXML(acknowledgementReport, fileName);
			});
		}
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.HOURS);
		long timeinSeconds = (System.currentTimeMillis() - startTime) / 1000;
		System.out.println("Time taken to run a program : " + timeinSeconds);
	}

	private static AcknowledgementReport getAckTestData(String externalReferenceId, String receiverId,
			AckType ackType) {
		AcknowledgementReport acknowledgementReport = new AcknowledgementReport();
		acknowledgementReport.setExternalReferenceId(externalReferenceId);
		acknowledgementReport.setExternalScheduleId("TestData");
		acknowledgementReport.setBusinessAlias("TestData");
		acknowledgementReport.setBusinessAliasName("TestData");
		acknowledgementReport.setReportName("TestData");
		ContactsList contactsList = new ContactsList();
		contactsList.setEmailId("emailid");
		contactsList.setTimezone("IST");
		contactsList.setRecipientType("TO");
		acknowledgementReport.setContactsList(contactsList);
		acknowledgementReport.setFromEmailId("TestData");
		acknowledgementReport.setEmailSubject("TestData");
		acknowledgementReport.setDocumentType("TestData");
		acknowledgementReport.setDirectionCode("1");
		acknowledgementReport.setReceiverId(receiverId);
		acknowledgementReport.setSenderId("Sen");
		acknowledgementReport.setNotificationAction(NotificationAction.MARK_REVIEWED_AND_SEND_NOTIFICATION.toString());
		acknowledgementReport.setAckType(ackType.toString());
		acknowledgementReport.setLookBackInMins("1440");
		ReportDeliveryFormats deliveryFormats = new ReportDeliveryFormats("Text", "BODY");
		ReportDeliveryFormats deliveryFormats1 = new ReportDeliveryFormats("CSV", "ATTACHMENT");
		acknowledgementReport.getReportDeliveryFormats().add(deliveryFormats);
		acknowledgementReport.getReportDeliveryFormats().add(deliveryFormats1);
		ReportDeliveryMethods reportDeliveryMethods = new ReportDeliveryMethods("SMTP");
		acknowledgementReport.setReportDeliveryMethods(reportDeliveryMethods);
		return acknowledgementReport;
	}

	private static void jaxbObjectToXML(AcknowledgementReport acknowledgementReport, String fileName) {
		try {
			JAXBContext context = JAXBContext.newInstance(AcknowledgementReport.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(acknowledgementReport, new File(fileName));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
