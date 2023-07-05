package com.sudha.tech.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.sudha.tech.Person;

public class ConvertXmlToJava {

	public static void main(String[] args) throws Exception {
		
		File xmlfile = new File("Person.xml");
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Object object = unmarshaller.unmarshal(xmlfile);
		
		Person person = (Person) object;
		
		System.out.println(person);
	}
}
