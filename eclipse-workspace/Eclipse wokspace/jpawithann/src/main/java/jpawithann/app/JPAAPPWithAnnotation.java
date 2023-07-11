package jpawithann.app;

import jpawithann.entities.Department;
import jpawithann.service.DepartmentService;
import jpawithann.service.DepartmentServiceImpl;

public class JPAAPPWithAnnotation {

	public static void main(String[] args) {
		
		DepartmentService departmentService = new DepartmentServiceImpl();
		
//		//Create
//		Department department = new Department();
//		department.setDeptName("Admin");
//		departmentService.addDepartment(department);
//		
//		//Retrieve
//		Department dept = departmentService.getDepartmentById(1);
//	    System.out.println(dept);
//	    
//	    //Retrieve All Departments
//	    System.out.println(departmentService.getAllDepartment());
		
		Department dept =new Department();
		dept.setDeptName("Maintainence");
		dept.setDeptNo(15);
		System.out.println(dept);
		
		System.out.println(departmentService.getAllDepartment());
	    
	}

}
