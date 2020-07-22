package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private long id;
	private String fName;
	private String lName;
	private String empId;
	private String phNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	@Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + fName + ", lastName=" + lName + ", emailId=" + empId
    + "]";
    }	

}
