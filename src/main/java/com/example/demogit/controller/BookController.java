package com.example.demogit.controller;

import com.example.demogit.model.request.Request;
import com.example.demogit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public String create(@RequestBody Request request){
        String result = bookService.create(request);
        return result;
    }
}
