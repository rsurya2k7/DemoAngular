package com.surya.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.surya.springboot.domain.Person;
import com.surya.springboot.repo.PersonRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping(path = "/person", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Person> getPerson1() {
		Pageable limit = new PageRequest(0, 10);
		return (List<Person>) personRepository.findAll(limit);
	}

	@RequestMapping(path = "/person/{name}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Person> getPerson(@PathVariable("name") String name) {
		if (name != null && !name.equals("")) {
			return personRepository.findByFirstNm(name);
		} else
			return (List<Person>) personRepository.findAll();
	}
}
