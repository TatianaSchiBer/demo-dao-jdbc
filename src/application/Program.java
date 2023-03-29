package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	/*	
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(20,"Bob","bob@gmail.com",new Date(),3000.00,obj);
		SellerDao sellerDao = DaoFactory.creaSellerDao();
		*/
		System.out.println("====== TEST 1: seller findById ============");
		SellerDao sellerDao = DaoFactory.creaSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n====== TEST 2: seller findByDepartment ============");
		Department department = new Department(2,null);
		List<Seller>list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
	}

}
