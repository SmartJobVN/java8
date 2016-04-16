/*
 * Copyright (C) 2016 - SmartJob.vn
 * SmartJob VN proprietary/confidential. Use is subject to license terms.
 * Website: http://smartJob.vn
 * Email: contact@smartJob.vn
 * Telephone: (84)-4-6294 44 47
 */
package com.smartJob.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by traditional way.
 *
 * @author Do Nhu Vy
 */
public class Sorting {

	// Khởi tạo cấu trúc dữ liệu.
	private static List<Employee> getEmployees() {
		List<Employee> result = new ArrayList<Employee>();
		result.add(new Employee("VyDN", new BigDecimal("750000"), 29));
		result.add(new Employee("AnhHT", new BigDecimal("800000"), 23));
		result.add(new Employee("ConNV", new BigDecimal("10000000"), 22));
		result.add(new Employee("KhanhND", new BigDecimal("17500000"), 26));
		return result;
	}

	// Tiện ích hỗ trợ in kết quả ra màn hình.
	private static void printResult(List<Employee> listEmployees) {
		for (Employee employee : listEmployees) {
			System.out.print("Họ tên: " + employee.getName() + ", ");
			System.out.print("Tuổi: " + employee.getAge() + ", ");
			System.out.println("Lương: " + employee.getSalary() + " VND");
		}
	}

	public static void main(String[] args) {
		List<Employee> listEmployees = getEmployees();
		System.out.println("-------------------Trước khi sắp xếp-------------------");
		printResult(listEmployees);

		// Sắp xếp theo tuổi của nhân viên.
		Collections.sort(listEmployees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getAge() - e2.getAge();
			}
		});

		System.out.println("--------------Sau khi sắp xếp theo tuổi-----------");
		printResult(listEmployees);
	}

}

// Kết quả:

//-------------------Trước khi sắp xếp-------------------
//Họ tên: VyDN, Tuổi: 29, Lương: 750000 VND
//Họ tên: AnhHT, Tuổi: 23, Lương: 800000 VND
//Họ tên: ConNV, Tuổi: 22, Lương: 10000000 VND
//Họ tên: KhanhND, Tuổi: 26, Lương: 17500000 VND
//--------------Sau khi sắp xếp theo tuổi-----------
//Họ tên: ConNV, Tuổi: 22, Lương: 10000000 VND
//Họ tên: AnhHT, Tuổi: 23, Lương: 800000 VND
//Họ tên: KhanhND, Tuổi: 26, Lương: 17500000 VND
//Họ tên: VyDN, Tuổi: 29, Lương: 750000 VND
