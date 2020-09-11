package com.JJParser.jackson;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = { "name",
		                     "id",
		                     "designation",
		                     "salary"}
                    )
public class Person {
    private String name,designation;
    private int id,salary;
    
    Person(String name,String designation,int id,int salary)
    {
    	this.name = name;
    	this.designation = designation;
    	this.id = id;
    	this.salary = salary;
    }
    
    Person()
    {
    	
    }
    
    public String getName()
    {
    	return name;
    }
    public void SetName(String name)
    {
    	this.name = name;
    }
    public String getDesignation()
    {
    	return designation;
    }
    public void SetDesignation(String designation)
    {
    	this.designation = designation;
    }
    public int getId()
    {
    	return id;
    }
    public void SetId(int id)
    {
    	this.id = id;
    }
    public int getSalary()
    {
    	return salary;
    }
    public void SetSalary(int salary)
    {
    	this.salary = salary;
    }
    
    public String toString()
    {
    	return "name : " + name + "\n" + "designation : " + designation + "\n" +
               "id : " + id + "\n" + "salary : " + salary;
    }
}

