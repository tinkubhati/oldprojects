package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDAO;
import jdbcapp.dao.CustomerDAOImpl;
import jdbcapp.dto.Customer;



public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDao = new CustomerDAOImpl();



   public Customer getCustomerById(Integer customerId) {
        
        return customerDao.getCustomerById(customerId);
    }


   public List<Customer> getCustomers() {
        
        return customerDao.getCustomers();
    }



   public Integer addCustomer(Customer customer) {
        
        return customerDao.addCustomer(customer);
    }



   public Integer deleteCustomer(Integer customer) {
        
        return customerDao.deleteCustomer(customer);
    }



   public Integer updateCustomer(Customer customer) {
        
        return customerDao.updateCustomer(customer);
    }


   public List<Customer> getAllCustomers() {
	// TODO Auto-generated method stub
	return null;
}

}

