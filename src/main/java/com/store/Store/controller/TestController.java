package com.store.Store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
     @GetMapping("/")
    public String getHome() {
         return "Home";
     }

     @GetMapping("/test")
     public String getTest() {
         return "test";
     }

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setName("Michael");
        person.setAge(40);
        return person;
    }
}

class Person {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
