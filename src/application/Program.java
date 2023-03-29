package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	/*	
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(20,"Bob","bob@gmail.com",new Date(),3000.00,obj);
		SellerDao sellerDao = DaoFactory.creaSellerDao();
		*/
		
		SellerDao sellerDao = DaoFactory.creaSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
