package com.example.bean;

import java.util.List;


public class EmployeeRootContainer {

	private long empId;
	private String empName;
	private boolean permanent;
	private Address0 address;
	private List<String> phoneNumbers;
	private String role;
	private List<String> cities;
	private Properties properties;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Address0 getAddress() {
		return address;
	}

	public void setAddress(Address0 address) {
		this.address = address;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "EmployeeRootContainer [empId=" + empId + ", empName=" + empName + ", permanent=" + permanent
				+ ", address=" + address + ", phoneNumbers=" + phoneNumbers + ", role=" + role + ", cities=" + cities
				+ ", properties=" + properties + "]";
	}

}
