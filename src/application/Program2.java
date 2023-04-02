package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.creaDeppartmentDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Department>list = departmentDao.findAll();
		for (Department depart : list) {
			System.out.println(depart);
			
		}
		
		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null,"Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted. New Id: " + newDepartment.getId());

		
		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(6);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed."); 
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(8);
		System.out.println("Delete completed");

		sc.close();
		
	}
		
		

}
