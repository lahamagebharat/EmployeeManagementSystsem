package EmployeemanagementJPAwithoutspringboot.service;

import EmployeemanagementJPAwithoutspringboot.Dao.EmployeeDao;
import EmployeemanagementJPAwithoutspringboot.Entity.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		//1.save
		EmployeeDao o=new EmployeeDao();
		Employee emp=new Employee("Rohit",100000);
		String msg=o.saveEmployee(emp);
		System.out.println(msg);
	}

}
