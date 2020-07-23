package com.explorer.springboot.mapper;

import com.explorer.springboot.pojo.NewCategory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NewCategoryMapper {
    List<NewCategory> findAll_new();
}