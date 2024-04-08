package com.ohgiraffer.section01.autowired.subsection02.constructor;

import com.ohgiraffer.section01.common.BookDAO;
import com.ohgiraffer.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceConstructor")
public class BookService {

    /* 필기.
        필드 주입은 의존성이 있는 객체가 생성되지 않아도 객체 생성이 가능하다.
     */

    private  final  BookDAO bookDAO;

    @Autowired
    public  BookService(BookDAO bookDAO) {

        this.bookDAO = bookDAO;

    }

    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }




}
