package com.cg.dto;



//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@NotNull(message = "employee id is mandatory")
	@Max(value=100, message="employee id should be in three digits only")
	private int empId;
	

	@NotBlank(message = "employee name is mandatory")
	@Size(max=12,message="Maximum allowed length of employee name is 12")
	private String empName;
	

	@NotBlank(message="Employee adress cannot be blank")
	@Size(min=5,message="adresss sholud be more than 5 characters")
	private String adress;
	

	@NotBlank(message = "employee name is mandatory")
	@Min(value=4,message="Miminum length of gender is 4")
//	@Max(value=6,message="maximum length of gender is 6")
	private String gender;
	
	@NotNull(message = "employee Contact Number is mandatory")
	@Min(value=1000000000L, message="employee Contact Number is Invalid")
	private Long contactNumber;
	
/*	@NotNull(message = "Booking Date is mandatory")
	@Past
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	*/
	
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
	public Employee(
			 int empId,
			 String empName,
			 String adress,
			 String gender,
			 Long contactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.adress = adress;
		this.gender = gender;
		this.contactNumber = contactNumber;
	}
	
	
	

}
