package com.blog.controller;

import com.blog.domain.Book;
import com.blog.mapper.BookMapper;
import com.blog.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }
    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
//    @PostMapping("/add")
//    public void add(@RequestParam String type,@RequestParam String name,@RequestParam String description) {
//        bookMapper.addbook( type,name,description);
//    }
}
