package com.smartJob.demo;

import java.math.BigDecimal;

public class Employee {
	
	// Tên của nhân viên.
	String name;
	// Tuổi.
	Integer age;
	// Lương của nhân viên.
	BigDecimal salary;

	public Employee() {
		
	}

	public Employee(String name, BigDecimal salary, Integer age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
