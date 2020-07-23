package com.explorer.springboot.mapper;

import java.util.List;
import  com.explorer.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CategoryMapper {
    @Select("select * from category_ ")
    List<Category> findAll();
}