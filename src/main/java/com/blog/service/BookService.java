package com.blog.service;

import com.blog.domain.Book;
import com.blog.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book getById(Integer id);
}
