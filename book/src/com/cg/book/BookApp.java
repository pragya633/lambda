package com.cg.book;
import book.Book;

import java.time.LocalDate;
	import java.time.Month;
	import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	public class BookApp {
		public static void main(String[] args) {
			List<Book> bookList=new ArrayList<>();
			bookList.add(new Book(101, "Harry Potter 1", 1250, LocalDate.of(2000,Month.JANUARY, 1)));
			bookList.add(new Book(102, "Harry Potter 3", 9250, LocalDate.of(2001,Month.FEBRUARY, 13)));
			bookList.add(new Book(103, "Harry Potter 3", 3250, LocalDate.of(2002,Month.JANUARY, 21)));
			bookList.add(new Book(104, "Harry Potter 2", 8250, LocalDate.of(2003,Month.MARCH, 19)));
			bookList.add(new Book(105, "Harry Potter 5", 5250, LocalDate.of(2004,Month.APRIL, 10)));
			
			for(Book b:bookList){
				System.out.println(b);
			}
			
			System.out.println("-------------------------------------");
			Collections.sort(bookList,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
			for(Book b:bookList){
				System.out.println(b);
			}
			
			System.out.println("-------------------------------------");
			Collections.sort(bookList,(b1,b2)->((Double)b1.getPrice()).compareTo(b2.getPrice()));
			for(Book b:bookList){
				System.out.println(b);
			}
		}

	}


