package com.hch.dao;

import com.hch.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Joey
 * @date 2020/5/9 - 12:45 - 2020
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int id);
    //查询全部书
    List<Books> queryAllBook();
    Books queryBookByName(@Param("bookName") String bookName);
}
