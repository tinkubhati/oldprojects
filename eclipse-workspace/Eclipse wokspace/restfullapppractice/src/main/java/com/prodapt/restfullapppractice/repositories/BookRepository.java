package com.prodapt.restfullapppractice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restfullapppractice.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	
	public List<Book> findByAuthor(String author);
	public List<Book> findByPublisher(String publisher);
	public Book findByName(String bookName);
	public void deleteByName(String bookName);

}
