/*
 * Copyright (C) 2016 - SmartJob.vn
 * SmartJob VN proprietary/confidential. Use is subject to license terms.
 * Website: http://smartJob.vn
 * Email: contact@smartJob.vn
 * Telephone: (84)-4-6294 44 47
 */
package com.smartJob.demo;

import java.math.BigDecimal;

/**
 * Employee entity.
 *
 * @author Do Nhu Vy
 */
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
