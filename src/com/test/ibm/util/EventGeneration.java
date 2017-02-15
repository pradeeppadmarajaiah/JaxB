/**
 * 
 */
package com.test.ibm.util;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.test.ibm.model.Event;

/**
 * @author pradeep
 *
 */
public class EventGeneration {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 1; i++) {
			String fileName = "Event_" + i + ".xml";
			executor.execute(() -> {
				Event event = new Event("EventLinked", "Event", "", "1", "false", "1860", "TestData",
						"2017-06-22T11:16:52 EDT",
						"IFN5c3RlbTogUE9EMDEgUHJvY2VzcyBJRDogNTkzMTg2MzEgQmF0Y2ggTnVtYmVyOiBPMjg4NTUwNTAgTWFpbHNsb3Q6IFNQVTVKTVFQ",
						"QAUSER", "403", "MQ_Message.dat", "false", "0",
						"SVNBKjAwKkZQRSAgICAgICAqMDEqMDA0MDU3MjA0ICpaWiowMDQwNTcyMDQtMTAwMTAqMDEqODEyNjc4Mzc4ICAgICAgKjA3MDYyMioxMTE1KlUqMDA0MDAqMDAwMDA2NTQ2KjAqUCojJEdTKklOKjAwNDA1NzIwNCo4MTI2NzgzNzgqMjAwNzA2MjIqMTExNSo2NTQ2KlgqMDA0MDEwJFNUKjgxMCo2NTQ2MDAxJEJJRyoyMDA3MDYyMioxMDAxMCRJVDEqTTM5MCoyNDAqUEMqMS45Nzc4KlFUKlBOKjQyNjAzQUQwNTEwMCpQSyoxKlpaKkFBJElUMSpNMzkwKjE2MCpQQyoyLjE1MTMqUVQqUE4qNDI2MDNBRDA2MDAwKlBLKjEqWloqQUEkUkVGKk1LKjUwMzk0MDI1JFJFRipJSyoxNDI5NjgkRFRNKjA1MCoyMDA3MDYyMiRURFMqODE4ODgkQ1RUKjIkU0UqMTAqNjU0NjAwMSRHRSoxKjY1NDYkSUVBKjEqMDAwMDA2NTQ2JA");
				jaxbObjectToXML(event, fileName);
			});
		}
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.HOURS);
		long timeinSeconds = (System.currentTimeMillis() - startTime) / 1000;
		System.out.println("Time taken to run a program : " + timeinSeconds);
	}

	private static void jaxbObjectToXML(Event event, String fileName) {
		try {
			JAXBContext context = JAXBContext.newInstance(Event.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(event, new File(fileName));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
