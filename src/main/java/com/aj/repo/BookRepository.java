package com.aj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aj.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
	//custom native query
	@Query(value="select * from book_tbl" ,nativeQuery=true)
	public List<Book> getAllBooks();
	
	//HQL QUERIES
	@Query("from Book")
	public List<Book> getBooks();

}
