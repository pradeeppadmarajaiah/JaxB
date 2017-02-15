package com.test.ibm.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.test.ibm.model.Doc;
import com.test.ibm.model.Document;
import com.test.ibm.model.DocumentReferenceNumber;
import com.test.ibm.model.DocumentReferenceNumbers;
import com.test.ibm.model.FunctionalAcknowledgment;
import com.test.ibm.model.Group;
import com.test.ibm.model.Interchange;
import com.test.ibm.model.ParentEventCodes;
import com.test.ibm.model.Transaction;

public class DocumentGeneration {
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 1; i++) {
			String fileName = "Document_" + i + ".xml";
			executor.execute(() -> {
				DocumentReferenceNumbers referenceNumbers = getDocumentReferenceNumber();
				FunctionalAcknowledgment functionalAcknowledgment = new FunctionalAcknowledgment();
				functionalAcknowledgment.setInterchange(new Interchange(
						new Interchange.ElementWithTagAttribute("InterchangeSenderID", "InterchangeSenderID"),
						new Interchange.ElementWithTagAttribute("GroupReceiverID", "GroupReceiverID"),
						new Interchange.ElementWithTagAttribute("InterchangeControlNumber", "GroupReceiverID"),
						"WAITING",
						new Group(new Group.GroupElementWithTagAttribute("GroupSenderID", "TestData"),
								new Group.GroupElementWithTagAttribute("GroupSenderID", "TestData"),
								new Group.GroupElementWithTagAttribute("GroupControlNumber", "TestData"), "WAITING",
								new Transaction(
										new Transaction.TransactionElementWithTagAttribute("TransactionSetIDCode",
												"TestData"),
										new Transaction.TransactionElementWithTagAttribute(
												"TransactionSetControlNumber", "TestData"),
										"WAITING"))));
				Doc doc = new Doc("TestData", "ORDER", "TestData", "TestData", "TestData", "TestData", "WAITING",
						Calendar.getInstance().getTimeInMillis(), referenceNumbers, functionalAcknowledgment);
				Document document = new Document();
				document.setMode("TestData");
				document.setEventCode("TestData");
				document.setParentEventCodes(new ParentEventCodes("TestData"));
				document.setStatusCode("0");
				document.setDirectionCode("1");
				document.setStatusCodeIsFinal("true");
				document.setTrackingPointID("440");
				document.setSystem("TestData");
				document.setEventTime("TestData");
				document.setEventDetail("TestData");
				document.setEventDetailI18n("TestData");
				document.setEventDetails0("TestData");
				document.setEventDetails1("TestData");
				document.setSenderAlias("TestData");
				document.setFileSize("801");
				document.setFilename("Flat_File.dat");
				document.setIsDocumentEvent("true");
				document.setFileGuid("TestData");
				document.setCharSet("TestData");
				document.setSourceBatchID("TestData");
				document.setDocument(doc);
				document.setFileData("TestData");
				System.out.println();
				jaxbObjectToXML(document, fileName);
			});
		}
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.HOURS);
		long timeinSeconds = (System.currentTimeMillis() - startTime) / 1000;
		System.out.println("Time taken to run a program : " + timeinSeconds);
	}

	/**
	 * @return
	 */
	private static DocumentReferenceNumbers getDocumentReferenceNumber() {
		DocumentReferenceNumbers referenceNumbers = new DocumentReferenceNumbers();
		List<DocumentReferenceNumber> documentReferenceNumbers = new ArrayList<>();
		documentReferenceNumbers.add(new DocumentReferenceNumber("InterchangeControlNumber", "TestData"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("InterchangeSenderID", "TestData"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("InterchangeReceiverID", "TestData"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("EnvelopeName", "TestData"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("Process ID", "TestData"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("Source Filename", "Editest.dat"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("Source Folder", ""));
		documentReferenceNumbers.add(new DocumentReferenceNumber("Source File Size", "1"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("Reference Number", "1"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("InterchangeControlNumber", "none"));
		documentReferenceNumbers.add(new DocumentReferenceNumber("ExtraInfo1", ""));
		documentReferenceNumbers.add(new DocumentReferenceNumber("ExtraInfo2", ""));
		documentReferenceNumbers.add(new DocumentReferenceNumber("ExtraInfo3", ""));
		referenceNumbers.setDocumentReferenceNumber(documentReferenceNumbers);
		return referenceNumbers;
	}

	private static void jaxbObjectToXML(Document document, String fileName) {
		try {
			JAXBContext context = JAXBContext.newInstance(Document.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(document, new File(fileName));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
