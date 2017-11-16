package com.surya.springboot.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.surya.springboot.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	public List<Person> findAll(Pageable page);
	public List<Person> findByFirstNm(String name);

}
