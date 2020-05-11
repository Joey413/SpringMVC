package com.hch.service;

import com.hch.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Joey
 * @date 2020/5/9 - 13:09 - 2020
 */

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryAllBook();

    Books queryBookName(String bookName);
}
