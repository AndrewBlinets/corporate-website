package by.ipps.adminpart.controller;

import by.ipps.adminpart.exception.InvalidJwtAuthenticationException;
import by.ipps.adminpart.utils.JwtTokenUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TestController {

    public TestController(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    @PreAuthorize("hasAuthority('SuperEditor')")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping(value = "/authenticate")
    @ResponseBody
    public String hello1(){
        return "Hello World!";
    }

    private final JwtTokenUtil jwtTokenUtil;

    @PostMapping("/logout")
    public ResponseEntity logout(HttpServletRequest request) throws InvalidJwtAuthenticationException {
        jwtTokenUtil.revokeToken(jwtTokenUtil.resolveToken(request));
        return ok().build();
    }
}
