package com.hemanth.HibLearn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	public Laptop(int lid, String lname) {
		this.lid = lid;
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}