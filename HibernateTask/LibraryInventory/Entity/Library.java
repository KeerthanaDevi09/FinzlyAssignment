package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	private int isbn;
	private String title;
	private String author;
	private int publication_year;
	boolean available;
	
	@Id
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publication_year="
				+ publication_year + ", available=" + available + "]";
	}
	
	
	
	
}


