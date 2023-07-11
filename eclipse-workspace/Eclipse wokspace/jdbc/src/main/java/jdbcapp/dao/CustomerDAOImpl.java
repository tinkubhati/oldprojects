package jdbcapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.dto.Customer;
import jdbcapp.util.DBConnSingleton;
import jdbcapp.util.DBConnectionUtil;

public class CustomerDAOImpl implements CustomerDAO {

	public Integer addCustomer(Customer customer) {
		int row = 0;
		try {
			PreparedStatement preparedStatement = DBConnSingleton.getInstance().prepareStatement(
					"INSERT INTO CUSTOMER(customerId,customerName,birthDate,mobile,email)VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());

			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return row;

	}

	public Customer getCustomerById(Integer customerId) {
		Customer customer = new Customer();
		try {
			PreparedStatement pStmt = DBConnectionUtil.getDBConnection().prepareStatement("Select * from customer");
			pStmt.setInt(1, customerId);
			ResultSet rs = pStmt.executeQuery();
			if(rs.next()) {
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setMobile(rs.getLong("mobile"));
				customer.setEmail(rs.getString("email"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	public List<Customer> getCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		// get a connection object
		Connection con = DBConnectionUtil.getDBConnection();

		// create a statement
		try {
			
			// execute the statement
			Statement statement = con.createStatement();
			// process the resultset
			ResultSet resultSet = statement.executeQuery("select * from customer where customerId=?");

			if (resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setMobile(resultSet.getLong("mobile"));
				customer.setEmail(resultSet.getString("email"));
				customer.setBirthDate(resultSet.getDate(3).toLocalDate());

				customerList.add(customer);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customerList;
	}

	public Integer updateCustomer(Customer customer) {
	
		int row = 0;
		
		try {
			PreparedStatement pStmt = DBConnectionUtil.getDBConnection().prepareStatement("Update customer set customerName=?,birthDate=?,mobile=?,email=? where customerId = ?");
			pStmt.setString(1, customer.getCustomerName());
			pStmt.setDate(2, Date.valueOf(customer.getBirthDate()));
			pStmt.setLong(3, customer.getMobile());
			pStmt.setString(4, customer.getEmail());
			pStmt.setInt(5,customer.getCustomerId());
			
			row = pStmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}

	public Integer deleteCustomer(Integer customer) {
        int row = 0;
        try {
            PreparedStatement preparedS = DBConnectionUtil.getDBConnection()
                    .prepareStatement("Delete from customer where customerId = ?");
            preparedS.setInt(1, customer);
            row = preparedS.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

       return row;
       
       
       public void
       
       
       
       
       
       
	}

	


	}


