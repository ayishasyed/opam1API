package com.JXParser;

import javax.xml.bind.JAXBException;

public class TestXmlJava {

	public static void main(String[] args) throws JAXBException {
		XmlJavaParser parser = new XmlJavaParser();
		parser.Unmarshalling("Employee.xml");
		
	}

}
