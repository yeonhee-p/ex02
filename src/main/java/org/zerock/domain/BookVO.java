package org.zerock.domain;

import java.util.Date;

public class BookVO {
	// 책 번호
	private int book_id;
	// 제목
	private String title;
	// 작성자
	private String writer;
	// 내용
	private String category;
	// 가격
	private int price;
	// 등록일자
	private Date insert_date;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	@Override
	public String toString() {
		return "BookVO [book_id=" + book_id + ", title=" + title + ", writer=" + writer + ", category=" + category
				+ ", price=" + price + ", insert_date=" + insert_date + "]";
	}

}
