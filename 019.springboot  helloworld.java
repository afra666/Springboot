package p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sba101302Application {
    @RequestMapping("")
    public String str() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Sba101302Application.class, args);
    }

}
