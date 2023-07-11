package jpawithann.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.persistence.Table;

@Entity
@Table(name="department_info")
@NamedQueries(
		{
		@NamedQuery(name="findDepartmentByName", 
					  query="from Department d where d.department = :dname" ),
		

		@NamedQuery(name="deleteDepartmentByName", 
					query="Delete from Department d where d.department = :dname")
				
		
			}
		)
//@NamedNativeQuery(name="Department.byName" , query = "select * from department_info where department=?", resultClass="Department.class")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dept_no")
	private Integer deptNo;
	@Column(name="dept_name")
	private String deptName;
	
	public Department() {
		
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	
	
}
