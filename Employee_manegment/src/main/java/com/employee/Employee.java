package com.employee;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String phone_no;
	private String gender;
	private String age;
	private String department;
	private String username;
	private String password;
	
	public Employee(int id, String name, String address, String phone_no, String gender, String age, String department,
			String username, String password) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.gender = gender;
		this.age = age;
		this.department = department;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone_no() {
		return phone_no;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	

	

}
