//package ecom.service;
//
//import org.hibernate.Session;
//import ecom.dao.EcomAppDAO;
//import ecom.dao.EcomAppDAOImpl;
//import ecom.entities.Customer;
//import ecom.entities.Order;
//import ecom.entities.Product;
//
//public class EcommAppServiceImpl implements EcommAppService {
//	
//	Session session = ecom.utility.HibernateUtility.getSessionFactory().openSession();
//	
//	EcomAppDAO ecomAppDao = new EcomAppDAOImpl();
//	
//
//	public void addCustomer(Customer customer) {
//		ecomAppDao.addCustomer(customer);
//
//	}
//
//	public void addProduct(Product product) {
//		ecomAppDao.addProduct(product);
//
//	}
//
//	public void addOrder(Order order) {
//		ecomAppDao.addOrder(order);
//
//	}
//
//}
