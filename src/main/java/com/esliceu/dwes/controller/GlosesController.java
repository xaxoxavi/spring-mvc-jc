package com.esliceu.dwes.controller;

import com.esliceu.dwes.domain.Glosa;
import com.esliceu.dwes.domain.GlosaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xavi on 24/01/18.
 */
@RestController
public class GlosesController {

    @Autowired
    private GlosaRepository glosaRepository;

    @RequestMapping("/gloses")
    public List<Glosa> gloses(){
        return (List<Glosa>) glosaRepository.findAll();
    }


    @RequestMapping(value = "/glosa",method = RequestMethod.POST)
    public ResponseEntity<String> glosa(@RequestBody Glosa glosa ){

        glosa.getVersos().stream().forEach(vers -> vers.setGlosa(glosa));

        glosaRepository.save(glosa);
       return ResponseEntity.ok("OK");
    }


}
