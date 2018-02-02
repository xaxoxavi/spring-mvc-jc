package com.esliceu.dwes.controller;

import com.esliceu.dwes.domain.Categoria;
import com.esliceu.dwes.domain.JdbcRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xavi on 2/02/18.
 */

@RestController
public class CategoriaController {

    @Autowired
    private JdbcRespository jdbcRespository;

    @RequestMapping("/categories")
    public List<Categoria> categories(){
        return jdbcRespository.findAllCategories();
    }
}
