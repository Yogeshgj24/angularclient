package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}
	
	public Books saveOrUpdate(Books books) {
		return booksRepository.save(books);
	}

}
