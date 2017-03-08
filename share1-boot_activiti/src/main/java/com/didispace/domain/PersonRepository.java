package com.didispace.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	public Person findByPersonName(String personName);
	
}
