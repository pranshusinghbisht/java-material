package com.masai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BooknotFoundException;

import com.masai.model.book;
import com.masai.repo.BooksDao;

@RestController
public class Mycontroller {

	@Autowired
	private BooksDao bdao;

	@PostMapping("/book")
	public book createbook(@RequestBody book b) {
		return bdao.save(b);

	}

	@GetMapping("/book")

	public List<book> getallbooks() throws BooknotFoundException {

		if (bdao.findAll().size() > 0) {
			return bdao.findAll();
		} else
			throw new BooknotFoundException("No books available");
	}

	@GetMapping("/book/{id}")
	public book bookbyid(@PathVariable Integer id) throws BooknotFoundException {

		if (bdao.findById(id).get() != null)

			return bdao.findById(id).get();

		else
			throw new BooknotFoundException("No books available");
	}
		
//		@GetMapping("/book/{author}")
//		public book bookbyauthor( @PathVariable String author) throws BooknotFoundException {
//
//			if (bdao.findById("author").get() != null)
//
//				return bdao.findById("author").get();
//
//			else
//				throw new BooknotFoundException("No books available");
//	}

	@PutMapping("/book")
	public book updatebook(@RequestBody book b) throws BooknotFoundException {
		if (bdao.findById(b.getBookId()) != null) {
			return bdao.save(b);
		} else
			throw new BooknotFoundException("Not book available");

	}

	@DeleteMapping("/book/{id}")
	public book Deletebook(@PathVariable Integer id) throws BooknotFoundException {

		Optional<book> opt = bdao.findById(id);
		if (opt.isPresent()) {
			book pr = opt.get();
			bdao.delete(pr);
			return pr;
		}

		else
			throw new BooknotFoundException("Not book available");
	}

}
