package com.surya.springboot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLMWHT.T_PERSON_VW")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "NAME")
	Long id;

	@Column(name = "FIRST_NM")
	String firstNm;

	@Column(name = "LAST_NM")
	String lastNm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public Person(Long id, String firstNm, String lastNm) {
		super();
		this.id = id;
		this.firstNm = firstNm;
		this.lastNm = lastNm;
	}

	public Person() {
		super();
	}

}
