package com.JXParser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JavaXmlParser {
	public void marshalling(Employee obj) throws JAXBException
	{
		JAXBContext jc = JAXBContext.newInstance(Employee.class);
		
		Marshaller m = jc.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		m.marshal(obj, System.out);
		
		m.marshal(obj, new File("Employee.xml"));
	}

}
class XmlJavaParser{
	public void Unmarshalling(String FileName) throws JAXBException
	{
       JAXBContext jc = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller m = jc.createUnmarshaller();
		
		Employee obj = (Employee) m.unmarshal(new File(FileName));
		
		System.out.println(obj);
		
	}
}