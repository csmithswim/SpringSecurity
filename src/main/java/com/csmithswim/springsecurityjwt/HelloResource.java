package com.csmithswim.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//REST API
@Controller
public class HelloResource {

    @RequestMapping({"/hello" })
    public String hello() {
        return "Hello world";
    }

}
