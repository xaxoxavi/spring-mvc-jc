package com.esliceu.dwes.controller;

import com.esliceu.dwes.domain.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;

/**
 * Created by xavi on 24/01/18.
 */
@Controller
public class GreetController {

    @Autowired
    private Greet greet;


    @RequestMapping(path= "/greet/{name}",method= RequestMethod.GET)
    public String greet(@PathVariable String name, ModelMap model){
        String greet =this.greet.getSay()  + " !!!" + name + " How are You?";

        model.addAttribute("greet", greet);
        System.out.println(greet);

        return "greet";
    }
}