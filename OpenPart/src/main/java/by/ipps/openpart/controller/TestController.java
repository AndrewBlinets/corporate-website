package by.ipps.openpart.controller;

import by.ipps.openpart.entity.User;
import by.ipps.openpart.utils.RestRequestToDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private RestRequestToDao restPostRequest;

    public TestController(RestRequestToDao restPostRequest) {
        this.restPostRequest = restPostRequest;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(){
//        User user = restPostRequest.restPostRequest(new User());
        return "Hello World111111!";
    }

}
