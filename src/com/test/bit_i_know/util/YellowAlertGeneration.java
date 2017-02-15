package com.test.bit_i_know.util;

import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.test.bit_i_know.data.NotificationAction;
import com.test.bit_i_know.data.YellowCriteria;
import com.test.bit_i_know.model.ContactsList;
import com.test.bit_i_know.model.ReportDeliveryFormats;
import com.test.bit_i_know.model.ReportDeliveryMethods;
import com.test.bit_i_know.model.YellowReport;

public class YellowAlertGeneration {

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 1; i++) {
			int count = 0;

			ContactsList contactsList = new ContactsList();
			contactsList.setEmailId("emailid");
			contactsList.setTimezone("IST");
			contactsList.setRecipientType("TO");
			List<ReportDeliveryFormats> reportDeliveryFormats = new ArrayList<>();
			ReportDeliveryFormats deliveryFormats = new ReportDeliveryFormats("Text", "BODY");
			ReportDeliveryFormats deliveryFormats1 = new ReportDeliveryFormats("CSV", "ATTACHMENT");
			reportDeliveryFormats.add(deliveryFormats);
			reportDeliveryFormats.add(deliveryFormats1);
			ReportDeliveryMethods reportDeliveryMethods = new ReportDeliveryMethods("SMTP");

			for (NotificationAction notificationAction : EnumSet.allOf(NotificationAction.class)) {
				for (YellowCriteria yellowCriteria : EnumSet.allOf(YellowCriteria.class)) {
					String receiverId = "Rec" + count;
					String externalReferenceId = "ERIDY" + count;
					String fileName = "yellowReport_" + i + "_" + notificationAction.toString() + "_" + yellowCriteria
							+ ".xml";
					YellowReport yellowReport = new YellowReport(externalReferenceId, "30MINUTES", "TestData",
							"TestData", "TestData", contactsList, "TestData", "TestData", "STATUS", "0", receiverId,
							"Sen", notificationAction.toString(), yellowCriteria.toString(), "1440", "30",
							reportDeliveryFormats, reportDeliveryMethods);
					jaxbObjectToXML(yellowReport, fileName);
					count++;
				}

			}

		}

		long timeinSeconds = (System.currentTimeMillis() - startTime) / 1000;
		System.out.println("Time taken to run a program : " + timeinSeconds);

	}

	private static void jaxbObjectToXML(YellowReport yellowReport, String fileName) {
		try {
			JAXBContext context = JAXBContext.newInstance(YellowReport.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(yellowReport, new File(fileName));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
