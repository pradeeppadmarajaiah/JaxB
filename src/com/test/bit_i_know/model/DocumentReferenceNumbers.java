package com.test.bit_i_know.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DocumentReferenceNumbers {
	public DocumentReferenceNumbers() {
		// TODO Auto-generated constructor stub
	}

	private List<DocumentReferenceNumber> documentReferenceNumber = new ArrayList<>();

	/**
	 * @return the documentReferenceNumber
	 */
	public final List<DocumentReferenceNumber> getDocumentReferenceNumber() {
		return documentReferenceNumber;
	}

	/**
	 * @param documentReferenceNumber
	 *            the documentReferenceNumber to set
	 */
	public final void setDocumentReferenceNumber(List<DocumentReferenceNumber> documentReferenceNumber) {
		this.documentReferenceNumber = documentReferenceNumber;
	}

	/**
	 * @param documentReferenceNumber
	 * @param type
	 */
	/*
	 * public DocumentReferenceNumbers(List<String> documentReferenceNumber,
	 * String type) { super(); this.documentReferenceNumber =
	 * documentReferenceNumber; this.type = type; }
	 * 
	 * private List<String> documentReferenceNumber = new ArrayList<String>();
	 * private String type;
	 * 
	 *//**
		 * @return the documentReferenceNumber
		 */
	/*
	 * @XmlElement(name = "DocumentReferenceNumber") public final List<String>
	 * getDocumentReferenceNumber() { return documentReferenceNumber; }
	 * 
	 *//**
		 * @return the type
		 */
	/*
	 * @XmlAttribute(name = "type") public final String getType() { return type;
	 * }
	 * 
	 *//**
		 * @param type
		 *            the type to set
		 */
	/*
	 * public final void setType(String type) { this.type = type; }
	 * 
	 *//**
		 * @param documentReferenceNumber
		 *            the documentReferenceNumber to set
		 */
	/*
	 * public final void setDocumentReferenceNumber(List<String>
	 * documentReferenceNumber) { this.documentReferenceNumber =
	 * documentReferenceNumber; }
	 * 
	 *//**
		 * @param documentReferenceNumber
		 *//*
		 * public DocumentReferenceNumbers(List<String> documentReferenceNumber)
		 * { super(); this.documentReferenceNumber = documentReferenceNumber; }
		 */

}
