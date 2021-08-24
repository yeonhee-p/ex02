package org.zerock.mapper;

import org.zerock.domain.BookVO;

public interface BookMapper {
	public void insert(BookVO vo);
	public BookVO detail(int book_id);
	public BookVO update(BookVO vo);

}
