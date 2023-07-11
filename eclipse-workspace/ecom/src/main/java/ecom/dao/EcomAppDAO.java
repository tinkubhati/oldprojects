package ecom.dao;

import ecom.entities.Customer;
import ecom.entities.Order;
import ecom.entities.Product;

public interface EcomAppDAO {

	public void addCustomer(Customer customer);
	public void addProduct(Product product);
	public void addOrder(Order order);
	


	
}
