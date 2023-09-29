package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@GetMapping("/book/{bookid}")
	private Books GetBooks(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);
	}
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		 booksService.saveOrUpdate(books);
		 return books.getBookId();
	}
	
	/*
	 		{
			    "bookId" : "02",
			    "bookname" : "Core Java II",
			    "author" : "XAbZ",
			    "price" : "700"
			}
	 
	 
	 */

}
