package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table_gokulraj")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_firstname")
	private String firstName;
	@Column(name = "student_lastname")
	private String lastName;
	@Column(name = "student_guardianname")
	private String guardianName;
	@Column(name = "joined_date")
	private String joinedDate;
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", guardianName=" + guardianName + ", joinedDate=" + joinedDate + "]";
	}
	
	
	
	
}
