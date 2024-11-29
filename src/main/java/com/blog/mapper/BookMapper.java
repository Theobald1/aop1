package com.blog.mapper;

import com.blog.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface BookMapper {
    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);
    @Select("select * from tbl_book")
    List<Book> getAll();

    void addbook(String type, String name,String description);
}