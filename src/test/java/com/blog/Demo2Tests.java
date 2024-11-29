package com.blog;


import com.blog.domain.Book;
import com.blog.mapper.BookMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2MybatisApplicationTests {

    @Autowired
    private BookMapper bookDao;

    @Test
    void contextLoads() {
        Book book = bookDao.getById(3);
        System.out.println(book);
    }

}