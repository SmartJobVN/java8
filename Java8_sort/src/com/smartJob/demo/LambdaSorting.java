package com.smartJob.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaSorting {

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
		// Sắp xếp theo tuổi của nhân viên. Sử dụng cú pháp Java 8.
		listEmployees.sort((Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
		listEmployees.forEach((employee) -> printResult(listEmployees));
	}

}

// Kết quả:

// -------------------Trước khi sắp xếp-------------------
// Họ tên: VyDN, Tuổi: 29, Lương: 750000 VND
// Họ tên: AnhHT, Tuổi: 23, Lương: 800000 VND
// Họ tên: ConNV, Tuổi: 22, Lương: 10000000 VND
// Họ tên: KhanhND, Tuổi: 26, Lương: 17500000 VND
// --------------Sau khi sắp xếp theo tuổi-----------
// Họ tên: ConNV, Tuổi: 22, Lương: 10000000 VND
// Họ tên: AnhHT, Tuổi: 23, Lương: 800000 VND
// Họ tên: KhanhND, Tuổi: 26, Lương: 17500000 VND
// Họ tên: VyDN, Tuổi: 29, Lương: 750000 VND
