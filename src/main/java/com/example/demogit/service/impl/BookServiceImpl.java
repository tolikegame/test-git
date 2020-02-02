package com.example.demogit.service.impl;

import com.example.demogit.Entity.Book;
import com.example.demogit.model.request.Request;
import com.example.demogit.repository.BookRepository;
import com.example.demogit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public String create(Request request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setPublish(request.getPublish());
        book.setDate(request.getDate());
        Book a = bookRepository.save(book);
        if(a!=null){
            return "成功";
        }
        return "失敗";
    }
}
