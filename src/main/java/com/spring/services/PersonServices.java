package com.spring.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.spring.entity.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
		
		logger.info("Findng new person...");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFisrtName("Vitor");
		person.setLastName("Bonato");
		person.setAddres("Real Parque");
		person.setEmail("vitor@java.com");
		person.setGender("Male");
		
		return person;
	}
	
}
