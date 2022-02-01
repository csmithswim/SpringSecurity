package com.csmithswim.springsecurityjwt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloResource {

    @RequestMapping({"/hello" })
    public String hello() {
        return "Hello world";
    }

}
