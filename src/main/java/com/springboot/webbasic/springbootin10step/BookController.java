package com.springboot.webbasic.springbootin10step;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<BookDetails> getallBooks(){
		
		return Arrays.asList(new BookDetails(1,"gautam","learn spring"));
	}
	
	
}
