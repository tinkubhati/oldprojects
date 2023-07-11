package jdbcapp.dao;

import java.util.List;



import jdbcapp.dto.Customer;



public interface CustomerDAO {
    //create
    public Integer addCustomer(Customer customer);
    
    //retrieve
    public Customer getCustomerById(Integer customerId);
    
    ////retrieve all customers
    public List<Customer> getCustomers();
    
    //update
    public Integer updateCustomer(Customer customer);
    
    //delete
    public Integer deleteCustomer(Integer customerId);



}