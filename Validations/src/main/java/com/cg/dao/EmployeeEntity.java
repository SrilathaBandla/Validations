package com.cg.dao;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class EmployeeEntity {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empId")
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="adress")
	private String adress;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="contactNumber")
	private Long contactNumber;

	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int empId, String empName, String adress, String gender, Long contactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.adress = adress;
		this.gender = gender;
		this.contactNumber = contactNumber;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	

}
