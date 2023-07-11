package tablerelation.onetooneuni;

import org.hibernate.Session;

import tablerelation.utility.HibernateUtility;

public class OneToOneUniDemo {

	public static void main(String[] args) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		
	Address homeAdd = new Address();	
	homeAdd.setCity("Greater Noida");
	homeAdd.setState("UP");
	homeAdd.setStreet("Street 2");
	homeAdd.setZipCode("201310");
		
	Student stu = new Student();
	stu.setStudentName("Tinku");
    stu.setAddress(homeAdd);
    
    session.beginTransaction();
    session.persist(stu);
    session.getTransaction().commit();
    
    
    
    
	}

}
