package jdbcapp.ui;

import java.time.LocalDate;

import jdbcapp.dto.Customer;
import jdbcapp.service.CustomerService;
import jdbcapp.service.CustomerServiceImpl;

public class MAinApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.getCustomers());

		Customer cust1 =new Customer(3,"Tinku Bhati",LocalDate.of(1999,10, 8) ,9938473752L,"tinkubhati@gmail.com");
		Integer numberOfRowAdd = customerService.addCustomer(cust1);
		System.out.println(numberOfRowAdd);
		
		cust1.setCustomerName("Saurabh Agrawal");
        cust1.setBirthDate(LocalDate.of(1993, 9, 28));
        cust1.setMobile(9996663334L);
        cust1.setEmail("saurabh805@gmail.com");
        System.out.println(customerService.updateCustomer(cust1));
        System.out.println(customerService.getCustomers());
		
		
		
	}


	

}
