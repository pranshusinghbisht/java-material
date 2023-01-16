package com.masai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.masai.exception.BooknotFoundException;

import com.masai.model.book;
import com.masai.repo.BooksDao;

@RestController
@RequestMapping("/bookservice")
public class Mycontroller {

	@Autowired
	private BooksDao bdao;

	@PostMapping("/book")
	public book createbook(@RequestBody book b) {
		return bdao.save(b);

	}

	@GetMapping("/books")
	public List<book> getallbooks() throws BooknotFoundException {

		if (bdao.findAll().size() > 0) {
			return bdao.findAll();
		} else
			throw new BooknotFoundException("No books available");
	}

	@GetMapping("/books/{id}")
	public book bookbyid(@PathVariable Integer id) throws BooknotFoundException {

		if (bdao.findById(id).get() != null)

			return bdao.findById(id).get();

		else
			throw new BooknotFoundException("No books available");
	}


	@PutMapping("/book")
	public book updatebook(@RequestBody book b ) throws BooknotFoundException {
		if (bdao.findById(b.getBookId()) != null) {
			return bdao.save(b);
		} else
			throw new BooknotFoundException("Not book available");

	}

	@DeleteMapping("/books/{id}")
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
