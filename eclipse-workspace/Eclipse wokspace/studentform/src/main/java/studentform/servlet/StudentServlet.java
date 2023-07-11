package studentform.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentform.dao.StudentDAOImpl;
import studentform.entities.Student;



@WebServlet("/student")

public class StudentServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		try {
			switch (action) {
			case "/new":
				showNewForm(req, resp);
				break;
			case "/insert":
				insertStudent(req, resp);
				break;
			case "/delete":
				deleteStudent(req, resp);
				break;
			case "/edit":
				showEditForm(req, resp);
				break;
			case "/update":
				updateStudent(req, resp);
				break;
			default:
				listStudent(req, resp);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}

	}

	private void listStudent(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException, ServletException {
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		List<Student> listStudent = new ArrayList<Student>();
		listStudent = studentDAOImpl.getAllStudent();
		req.setAttribute("listStudent", listStudent);
		RequestDispatcher dispatcher = req.getRequestDispatcher("liststudent.jsp");
		dispatcher.forward(req, resp);
		// TODO Auto-generated method stub

	}

	private void updateStudent(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");

		Student stud = new Student(id, name, email);
		StudentDAOImpl studentDaoImpl = new StudentDAOImpl();
		studentDaoImpl.updateStudent(stud);
		resp.sendRedirect("list");
	}
	// TODO Auto-generated method stub

	private void showEditForm(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDAOImpl existingStudent = new StudentDAOImpl();
		existingStudent.getStudentById(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("studentform.jsp");
		req.setAttribute("Student", existingStudent);
		dispatcher.forward(req, resp);

	}

	private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDAOImpl studentDaoImpl = new StudentDAOImpl();
		studentDaoImpl.deleteStudent(id);
		resp.sendRedirect("list");
		// TODO Auto-generated method stub

	}

	private void insertStudent(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Student addStudent = new Student(name, email);
		StudentDAOImpl studentDaoImpl = new StudentDAOImpl();
		studentDaoImpl.addStudent(addStudent);
		resp.sendRedirect("list");

		// TODO Auto-generated method stub

	}

	private void showNewForm(HttpServletRequest req, HttpServletResponse resp)
			// TODO Auto-generated method stub
			throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("studentform.jsp");
		dispatcher.forward(req, resp);
	}

}