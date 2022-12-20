package com.glearning.crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {


	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@Column(name= "teacher_name", nullable =false)
	private String name;

@Column(name= "teacher_salary", nullable =false)
	private int salary;

@Column(name= "teacher_email", nullable =false)
	private String emailAddress;


@OneToOne(mappedBy = "teacher", cascade = CascadeType.ALL)
@PrimaryKeyJoinColumn
private TeacherDetails teacherDetails;



public Teacher() {
	
}


public Teacher(String name, int salary, String emailAddress) {
	
	this.name = name;
	this.salary = salary;
	this.emailAddress = emailAddress;
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public TeacherDetails getTeacherDetails() {
	return teacherDetails;
}

public void setTeacherDetails(TeacherDetails teacherDetails) {
	this.teacherDetails = teacherDetails;
}



//scaffolding code

public void addTeacherDetails(TeacherDetails teacherDetails) {
	this.teacherDetails = teacherDetails;
	 teacherDetails.setTeacher(this);
}



@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", emailAddress=" + emailAddress + "]";
}



}
