package com.lti.ArrayListDemos;

public class Book {
	
	int BookId;
	String BookName;
	public int getBookId() {
		return BookId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BookId;
		result = prime * result + ((BookName == null) ? 0 : BookName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (BookId != other.BookId)
			return false;
		if (BookName == null) {
			if (other.BookName != null)
				return false;
		} else if (!BookName.equals(other.BookName))
			return false;
		return true;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	@Override
	public String toString() {
		return "\nBook [BookId=" + BookId + ", BookName=" + BookName + "]";
	}
	public Book(int bookId, String bookName) {
		super();
		BookId = bookId;
		BookName = bookName;
	}
	public Book() {
		super();
	}
	

}
