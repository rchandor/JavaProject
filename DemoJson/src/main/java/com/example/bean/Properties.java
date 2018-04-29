package com.example.bean;

public class Properties {

	private long age;
	private double salary;

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Properties [age=" + age + ", salary=" + salary + "]";
	}

}
