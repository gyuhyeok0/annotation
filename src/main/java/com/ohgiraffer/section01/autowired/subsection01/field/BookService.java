package com.ohgiraffer.section01.autowired.subsection01.field;

import com.ohgiraffer.section01.common.BookDAO;
import com.ohgiraffer.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    // BookDAO 타입의 bean 객체를  이 프로퍼티에 자동을 주입해준다. (원래는 new 연산자로)
    @Autowired
    private BookDAO bookDAO;
    

    // 전체조회 호출
    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();
    }

    // 전호로 책 하나 조회
    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }


}
