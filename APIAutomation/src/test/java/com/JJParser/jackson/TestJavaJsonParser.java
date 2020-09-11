package com.JJParser.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJavaJsonParser {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
     Person p = new Person("Sabira","Doctor",25,25000);
     Person p1 = new Person("Sahira","Scientist",15,45000);
     JavaJsonParser parser = new JavaJsonParser();
     parser.marshalling(p);
     parser.marshalling(p1);
     System.out.println("pass");
	}

}
