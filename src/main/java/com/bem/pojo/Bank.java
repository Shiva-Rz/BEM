package com.bem.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private int eid;
	private String fname;
	private String lname;
	private String role;
	private int lid;
	private String pwd;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int eid, String fname, String lname, String role, int lid, String pwd) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.lid = lid;
		this.pwd = pwd;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Bank [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", role=" + role + ", lid=" + lid
				+ ", pwd=" + pwd + "]";
	}

}
