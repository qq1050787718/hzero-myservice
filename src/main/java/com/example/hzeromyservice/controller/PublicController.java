package com.example.hzeromyservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description BBBBoo
 * @Date 2019/12/13 10:05
 * @Author by Bbbbbo
 */
@RestController
@RequestMapping(value = "/public")
public class PublicController {
    @GetMapping(value = "/user/{id}")
    public String getUser(@PathVariable("id") String id){
        return id;
    }
}
