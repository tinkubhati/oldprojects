package studentform.dao;

import java.util.List;

import org.hibernate.Session;

import studentform.entities.Student;
import studentform.utility.HibernateUtility;



public class StudentDAOImpl implements StudentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();


	public void addStudent(Student stud) {
		// TODO Auto-generated method stub
		  // start a transaction
        session.beginTransaction();
       // save the student object
        session.persist(stud);
       // commit transaction
       session.getTransaction().commit();
		
	}

	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		// start a transaction
        session.beginTransaction();
       // save the student object
       session.update(stud);
       // commit transaction
       session.getTransaction().commit();
		
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		 session.beginTransaction();

	        // Delete a user object
	        Student stud = new Student();
	        if (stud != null) {
	            session.delete(stud);
	            System.out.println("Student is deleted");
	        }

	        // commit transaction
	        session.getTransaction().commit();
		
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		// start a transaction
        session.beginTransaction();
       // get an user object
        Student stud = new Student();
        stud = session.get(Student.class, id);
       // commit transaction
        session.getTransaction().commit();

		return stud;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List < Student > listOfStudent = null;
        
        // start a transaction
        session.beginTransaction();
        // get an user object

        listOfStudent = session.createQuery("from Student").getResultList();

        // commit transaction
        session.getTransaction().commit();


	return listOfStudent;
	}

	
	

}