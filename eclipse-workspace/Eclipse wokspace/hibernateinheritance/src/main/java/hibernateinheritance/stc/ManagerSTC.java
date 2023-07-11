package hibernateinheritance.stc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager_stc")
@DiscriminatorValue("MGR")
public class ManagerSTC extends EmployeeSTC {

	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}