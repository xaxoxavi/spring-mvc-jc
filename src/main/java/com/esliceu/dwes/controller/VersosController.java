package com.esliceu.dwes.controller;

import com.esliceu.dwes.domain.JdbcRespository;
import com.esliceu.dwes.domain.Vers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xavi on 1/02/18.
 */
@RestController
@RequestMapping("/versos")
public class VersosController {

    @Autowired
    private JdbcRespository jdbcRespository;

    @RequestMapping("")
    public List<Vers> versos(){
        return jdbcRespository.findAllVersos();
    }

    @RequestMapping("/{like}")
    public List<Vers> versosLike(@PathVariable String like){
        return jdbcRespository.findVersosLike(like);
    }



}
