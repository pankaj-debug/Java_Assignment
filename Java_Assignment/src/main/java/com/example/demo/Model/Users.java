package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private long id;
	private String fName;
	private String lName;
	private String empId;
	private long phNo;
	
	public Users() {
		  
    }
 
    public Users(Long id,String fName, String lName, String empId,Long phNo) {
    	this.id=id;
        this.fName = fName;
        this.lName = lName;
        this.empId = empId;
        this.phNo = phNo;
    }
		
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
	
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + fName + ", lastName=" + lName + ", emailId=" + empId
    + "]";
    }	

}
