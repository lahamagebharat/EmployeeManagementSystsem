package EmployeemanagementJPAwithoutspringboot.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EmployeemanagementJPAwithoutspringboot.Entity.Employee;

public class EmployeeDao {

	public static EntityManagerFactory getFactory() {
		EntityManagerFactory enititymanagerfactory = Persistence.createEntityManagerFactory("employeePU");
		return enititymanagerfactory;
	}

	public String saveEmployee(Employee emp) {
		EntityManagerFactory factory = EmployeeDao.getFactory();
		EntityManager entitymanager = factory.createEntityManager();

		entitymanager.getTransaction().begin();
		entitymanager.persist(emp);
		entitymanager.getTransaction().commit();

		return "Employee Saved Successfully";
	}

	public String updateData(int id) {
		EntityManagerFactory factory = EmployeeDao.getFactory();
		EntityManager entitymanager = factory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee emp = entitymanager.find(Employee.class, id);
		emp.setName("Mona");
		emp.setSalary(30000);
		entitymanager.merge(emp);
		entitymanager.getTransaction().commit();

		return "Data updaed successfully";

	}

	public Employee getData(int id) {
		EntityManagerFactory factory = EmployeeDao.getFactory();
		EntityManager entitymanager = factory.createEntityManager();
		Employee emp = entitymanager.find(Employee.class, id);
		return emp;

	}

	public String deleteData(int id) {
		EntityManagerFactory factory = EmployeeDao.getFactory();
		EntityManager entitymanager = factory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee emp = entitymanager.find(Employee.class, id);
		entitymanager.remove(emp);
		entitymanager.getTransaction().commit();
		
		return "Record deleted successfully";

	}

}
