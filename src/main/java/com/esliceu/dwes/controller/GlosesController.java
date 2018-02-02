package com.esliceu.dwes.controller;

import com.esliceu.dwes.domain.Glosa;
import com.esliceu.dwes.domain.GlosaRepository;
import com.esliceu.dwes.domain.JdbcRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xavi on 24/01/18.
 */
@RestController
public class GlosesController {

    @Autowired
    private GlosaRepository glosaRepository;

    @Autowired
    private JdbcRespository jdbcRespository;

    @RequestMapping("/gloses")
    public List<Glosa> gloses(){
        return  jdbcRespository.findGlosa();
    }


    @RequestMapping(value = "/glosa",method = RequestMethod.POST)
    public ResponseEntity<String> glosa(@RequestBody Glosa glosa ){

        glosa.getVersos().stream().forEach(vers -> vers.setGlosa(glosa));

        glosaRepository.save(glosa);
       return ResponseEntity.ok("OK");
    }

  /*  @RequestMapping("/glosa/{id}")
    public List<Glosa> findGlosaById(Integer id){
        return jdbcRespository.findGlosa();
    }*/




}
