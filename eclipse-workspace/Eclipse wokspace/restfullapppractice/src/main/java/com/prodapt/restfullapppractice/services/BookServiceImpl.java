package com.prodapt.restfullapppractice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.restfullapppractice.entities.Book;
import com.prodapt.restfullapppractice.repositories.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	@Override
	public List<Book> getAllBooks() {
	   List<Book> books = (List<Book>) bookRepo.findAll();
	
	   return books;
	}

	@Override
	public Book getBookById(Integer bookId) {
		
		Optional <Book> book = bookRepo.findById(bookId); 
		return book.get();
	}

	@Override
	public Book getBookByName(String bookName) {
		
		
		return bookRepo.findByName(bookName);
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		
		return bookRepo.findByAuthor(author);
	}

	@Override
	public List<Book> getBookByPublisher(String publisher) {
		
		
		return bookRepo.findByPublisher(publisher);
	}

	@Override
	public Book addBook(Book newBook) {
		return bookRepo.save(newBook);
	}

	@Override
	public String deleteBookById(Integer bookId) {
		
		bookRepo.deleteById(bookId);
		
		return " Book with BookId: "+ bookId +" Deleted successfully ";
		
	}

	@Override
	public String deleteBookByName(String bookName) {
		// TODO Auto-generated method stub
	   bookRepo.deleteByName(bookName);
	   return "Book with BookName :"+ bookName + "Deleted Successfully";

	}

	@Override
	public Book updateBook(Book newBook) {
		if(bookRepo.existsById(newBook.getBookId())) {
			return bookRepo.save(newBook);
	}else
		return newBook;
  }
}
