package com.glearning.crud.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "teacher_details")

public class TeacherDetails {
	
	@Id 
    @Column(name="teacher_details")
		
		private long id;
		private String adharNo;
		private LocalDate dob;
		private String city;
		
		@OneToOne
		@MapsId
		@JoinColumn(name= "teacher_id")
		private Teacher teacher;
		
		
		TeacherDetails() {
	}



		public TeacherDetails(String adharNo, LocalDate dob, String city) {
			
			this.adharNo = adharNo;
			this.dob = dob;
			this.city = city;
			
		}



		public long getId() {
			return id;
		}



		public void setId(long id) {
			this.id = id;
		}



		public String getAdharNo() {
			return adharNo;
		}



		public void setAdharNo(String adharNo) {
			this.adharNo = adharNo;
		}



		public LocalDate getDob() {
			return dob;
		}



		public void setDob(LocalDate dob) {
			this.dob = dob;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public Teacher getTeacher() {
			return teacher;
		}



		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}



		@Override
		public String toString() {
			return "TeacherDetails [id=" + id + ", adharNo=" + adharNo + ", dob=" + dob + ", city=" + city + "]";
		}
		
		
		
}


