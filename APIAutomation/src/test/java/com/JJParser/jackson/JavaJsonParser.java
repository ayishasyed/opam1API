package com.JJParser.jackson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaJsonParser {
	public void marshalling(Person p) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Person.json"), p);
		
	}

}

class JsonJavaParser
{
	public Person unmarshalling(String filename,Class<Person> p) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		Person persondata = mapper.readValue(new File(filename), p);
		return persondata;
	}
}
