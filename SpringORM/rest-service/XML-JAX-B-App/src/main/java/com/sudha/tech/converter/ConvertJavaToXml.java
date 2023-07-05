package com.sudha.tech.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.sudha.tech.Address;
import com.sudha.tech.Person;

public class ConvertJavaToXml {

	public static void main(String[] args) throws Exception {
		
		Address address = new Address();
		address.setCity("BLR");
		address.setCountry("India");
		address.setState("KA");
		
		Person person = new Person();
		person.setId(121);
		person.setName("Jack");
		person.setAge(25);
		person.setPhno(9849795563l);
		person.setType("Engineer");
		person.setAddress(address);
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		
		Marshaller marshaller = instance.createMarshaller();
		
		marshaller.marshal(person, new File("Person.xml"));
		
		System.out.println("Marshalling Completed.......");
	}
}
