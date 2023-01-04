package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/home")
    String helloWord() {
        return "Hello World!";
    }

    @RequestMapping("/")
    String ciaoMondo() {
        return "fabri sei la mia cagna, giorgio il mio cane,marcello suca e Omar gay!";
    }

    @RequestMapping("/test")
    String test() {
        return "test!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}