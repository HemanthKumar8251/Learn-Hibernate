package com.hemanth.HibLearn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {
	@Id
	private int sid;
	private StudentName sname;
	private String mobile;
	@OneToOne
	private Laptop lappy;
	public Student(int sid, StudentName sname, String mobile, Laptop lappy) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mobile = mobile;
		this.lappy = lappy;
	}
	public Laptop getLappy() {
		return lappy;
	}
	public void setLappy(Laptop lappy) {
		this.lappy = lappy;
	}
	public void setSname(StudentName sname) {
		this.sname = sname;
	}
	public StudentName getSname() {
		return sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mobile=" + mobile + "]";
	}
	
}
