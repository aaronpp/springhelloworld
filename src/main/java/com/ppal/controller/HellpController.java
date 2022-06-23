package com.ppal.controller;

import com.ppal.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HellpController {
    @Autowired
    private Person person;

    @ResponseBody
    @RequestMapping("/aaron")
    public Person hello(){
         return person;
    }



//    @ResponseBody
//    @RequestMapping("/person")
//    public Person person() {
//        return person;
//    }
}
