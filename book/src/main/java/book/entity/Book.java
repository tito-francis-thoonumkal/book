package book.entity;

import javax.persistence.Entity;

@Entity
public class Book {

	private Integer bookID;

	private String bookName;

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book() {
		super();
	}

}
