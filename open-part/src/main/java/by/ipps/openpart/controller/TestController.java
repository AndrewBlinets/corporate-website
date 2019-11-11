package by.ipps.openpart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello World111111!";
    }

}
