package com.aj;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aj.entity.Book;
import com.aj.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(Application.class, args);
				
		BookRepository repo = ctx.getBean(BookRepository.class);
		
		
		//fetching from custom native sql query 
		List<Book> allBooks = repo.getAllBooks();
		for(Book b : allBooks) {
			System.out.println(b);
		}
		
		System.out.println("Fetching from HQL Queiry");
		List<Book> bookList = repo.getBooks();
		for(Book b : bookList) {
			System.out.println(b);
		}
	}

}
