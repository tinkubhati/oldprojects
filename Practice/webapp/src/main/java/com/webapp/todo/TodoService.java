package com.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	 private static List<Todo> todos = new ArrayList<>() ;
	 
	 static{
		 
		 todos.add(new Todo(1,"Tinku","Spring-Boot",LocalDate.now().plusYears(1),false));
		 todos.add(new Todo(1,"Tinku","Learn Dev-Ops",LocalDate.now().plusYears(2),false));
		 todos.add(new Todo(1,"Tinku","Learn Cyber-Security",LocalDate.now().plusMonths(3),false));
		 todos.add(new Todo(1,"Tinku","Learn Blockchain",LocalDate.now().plusMonths(6),false));
		 
	 }
	 
	 public List<Todo> findByUsername ( String username){
		 
		 return todos;
	 }
	 
} 