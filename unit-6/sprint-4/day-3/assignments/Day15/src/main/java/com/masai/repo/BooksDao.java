package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.book;

public interface BooksDao extends JpaRepository<book,Integer>{

}
