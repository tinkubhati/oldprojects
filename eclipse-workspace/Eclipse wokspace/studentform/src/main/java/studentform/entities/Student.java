package studentform.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_details")
public class Student  {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    protected String name;
    protected String email;

	public Student(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	public Student(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;


		}
}
