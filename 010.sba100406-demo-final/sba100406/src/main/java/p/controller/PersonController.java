package p.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {

    @GetMapping("/person")
    public Person info(){
        Person person=new Person("abc@gmail.com","123456789");
        return person;
    }
}