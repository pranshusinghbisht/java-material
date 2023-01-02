package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {

	            @Id
	            @GeneratedValue(strategy = GenerationType.AUTO)
	            private Integer BookId ;
       
				private String name;
				private String author;
				private Integer price;
				
				public Integer getBookId() {
					return BookId;
				}
				public void setBookId(Integer bookId) {
					BookId = bookId;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getAuthor() {
					return author;
				}
				public void setAuthor(String author) {
					this.author = author;
				}
				public Integer getPrice() {
					return price;
				}
				public void setPrice(Integer price) {
					this.price = price;
				}
				public book(Integer bookId, String name, String author, Integer price) {
					super();
					BookId = bookId;
					this.name = name;
					this.author = author;
					this.price = price;
				}
				public book() {
					super();
					// TODO Auto-generated constructor stub
				}
				@Override
				public String toString() {
					return "book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", price=" + price
							+ "]";
				}
				
				
				
}
