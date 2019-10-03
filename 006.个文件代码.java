****************************************************准备工作
    a.下载lombok
    b.设置IDEA自动引入补全：Annotation Processors---->Enable annotation processing
****************************************************1.添加pom.xml依赖    【双击@Data】---->【add maven dependency】------>【add class】
  <dependency>    
              <groupId>org.projectlombok</groupId>    
              <artifactId>lombok</artifactId>    
              <optional>true</optional>    
  </dependency>    

****************************************************2.Person.java  
package p.controller;    

import lombok.AllArgsConstructor;    

import lombok.Data;    
import lombok.NoArgsConstructor;    
    
@Data    
@AllArgsConstructor    
@NoArgsConstructor    
public class Person {    
    private String name;    
    private String pwd;    
}    
****************************************************3.PersonController.java
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
****************************************************4.HelloController.java 
package p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController
public class HelloController {

    @GetMapping("/hello")
    //@RequestMapping


    @Override
    public String toString() {
        return "This is from web info";
    }
}
****************************************************5.测试页面  
http://localhost:8080/person    




