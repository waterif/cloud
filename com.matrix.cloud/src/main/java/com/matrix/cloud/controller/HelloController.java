package com.matrix.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController
{

    @RequestMapping(value = "/helloword", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@RequestParam("name") String name)
    {
        return "hello " + name;
    }
}
