package book;

import java.time.LocalDate;

public class Book {
	private int bookCode;
	private String title;
	private double price;
	private LocalDate publishDate;
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public Book(int bookCode, String title, double price, LocalDate publishDate) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate
				+ "]";
	}
	

}
