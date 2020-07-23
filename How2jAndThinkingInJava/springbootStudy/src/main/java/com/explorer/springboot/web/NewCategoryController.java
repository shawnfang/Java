package com.explorer.springboot.web;

import com.explorer.springboot.mapper.NewCategoryMapper;
import com.explorer.springboot.pojo.NewCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NewCategoryController {
    @Autowired NewCategoryMapper newCategoryMapper;

    @RequestMapping("/newListCategory")
    public String newListCategory(Model m) throws Exception {
        List<NewCategory> cs= newCategoryMapper.findAll_new();

        m.addAttribute("cs", cs);

        return "newListCategory";
    }
}