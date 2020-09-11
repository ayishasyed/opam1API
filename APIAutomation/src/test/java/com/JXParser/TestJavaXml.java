package com.JXParser;

import javax.xml.bind.JAXBException;

public class TestJavaXml {

	public static void main(String[] args) throws JAXBException {
		Employee e = new Employee("Sabira", "Teacher", 101,10000);
		Employee e1 = new Employee("Sahira", "Doctor", 102,20000);
		JavaXmlParser parser = new JavaXmlParser();
		parser.marshalling(e);
	}

}
