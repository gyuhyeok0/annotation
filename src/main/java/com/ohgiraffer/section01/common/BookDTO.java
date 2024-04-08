package com.ohgiraffer.section01.common;

import lombok.*;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class BookDTO {


    private int sequence;       // 번호

    private  int isbn; // 일련번호
    private String title; // 제목
    private String author; // 저자
    private  String publisher; // 출판사
    private Date createdDate; // 출간일
}
