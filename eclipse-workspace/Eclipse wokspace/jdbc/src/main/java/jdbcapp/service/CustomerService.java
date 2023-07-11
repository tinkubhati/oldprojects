package jdbcapp.service;

import java.util.List;



import jdbcapp.dto.Customer;



public interface CustomerService {
    
    public Customer getCustomerById(Integer customerId);
    public List<Customer> getCustomers();
    
    
    
    //update
    public Integer addCustomer(Customer customer);
    
    //delete
    public Integer updateCustomer(Customer customer);
    
    public Integer deleteCustomer(Integer customerId);



}