package com.employee.details;

public class employeeDetails {
	private String name;
	private String emp_id;
	private long mobile_num;
	
	public employeeDetails(String name, String emp_id, long mobile_num) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.mobile_num = mobile_num;
	}
	
	public employeeDetails() {
		
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

}
