package com.JJParser.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJsonJavaParser {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JsonJavaParser parser = new JsonJavaParser();
		Person p = parser.unmarshalling("Person.json", Person.class);
		//Person p1 = parser.unmarshalling("Person.json", Person.class);
		System.out.println("Person data is : ");
		System.out.println(p);
		//System.out.println(p1);
	}

}
