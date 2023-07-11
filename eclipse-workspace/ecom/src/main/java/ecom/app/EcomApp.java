package ecom.app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import ecom.entities.Customer;
import ecom.entities.Order;
import ecom.entities.Product;
import ecom.utility.HibernateUtility;

public class EcomApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();

		Customer cust = new Customer();
		cust.setName("Tinku Bhati");
		cust.setTier(3);

		Product pd = new Product();
		pd.setCategory("Mobile");
		pd.setName("Realme X2 Pro");
		pd.setPrice(31999.00);
		Set<Product> prod = new HashSet<Product>();
		prod.add(pd);
		

		Order ord = new Order();
		ord.setDeliveryDate(LocalDate.of(2021, 02, 28));
		ord.setOrderDate(LocalDate.of(2021, 02, 28));
		ord.setStatus("NEW");
		ord.setProducts(5);
		ord.setProducts(prod);
		ord.setCustomer(cust);
		
        session.beginTransaction();
        session.persist(ord);
        session.getTransaction().commit();

		
		

	}

}
