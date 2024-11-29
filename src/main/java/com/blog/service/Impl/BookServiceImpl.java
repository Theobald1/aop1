package com.blog.service.Impl;

import com.blog.domain.Book;
import com.blog.mapper.BookMapper;
import com.blog.mapper.DeptMapper;
import com.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        System.out.println("123");
        return bookMapper.getAll();
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }
}
