package EmployeemanagementJPAwithoutspringboot.controller;

import EmployeemanagementJPWwithoutspringboot.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService o = new EmployeeService();

		// 1.save
//		Employee emp = new Employee("Akshay", 53533);
//		String msg = o.saveEmployee(emp);
//		System.out.println(msg);

		// 2.Update
//		String msg1=o.updateData(4);
//		System.out.println(msg1);
//		
//		// 3.Getdata
//		Employee msg3 = o.getData(4);
//		System.out.println(msg3);
//		
//		// 4.DeleteData
		String msg4=o.deleteData(4);
		System.out.println(msg4);

	}

}
