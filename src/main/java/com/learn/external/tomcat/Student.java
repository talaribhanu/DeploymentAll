package com.learn.external.tomcat;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name; 

}
