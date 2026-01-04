package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		this.e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,
			String dept, int salary, double bonus) {
		this.e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		if(e!=null) {
			e.setPhone(phone);
		}
	}
	
	public void modify(int salary) {
		if(e!=null) {
			e.setSalary(salary);
		}
	}
	
	public void modify(double bonus) {
		if(e!=null) {
			e.setBonus(bonus);
		}
	}
	
	public Employee remove() {
		Employee temp = e;
		this.e = null;
		return temp;
	}
	
	public String inform() {
		if (e==null) {
			return null;
		}
		return e.printEmployee();
	}
	
	public Employee getE() {
		return e;
	}
}
