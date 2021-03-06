package org.zerock.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BookVO;
import org.zerock.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	@Autowired
	private BookMapper bmapper;
	public void create(BookVO vo){
		logger.info("BookServiceImpl create");
		bmapper.insert(vo);
	}
	
	/*public BookVO detail(int book_id) {
		return bmapper.detail(book_id);
	}
	public BookVO update(BookVO book) {
		return bmapper.update(book);
	}*/
}
