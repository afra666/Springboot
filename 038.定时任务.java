package pkg;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Configuration
@EnableScheduling
@Controller
public class UserController {
    @RequestMapping(value = "/")
    public String toString() {

        return "welcome.html";
    }
    @RequestMapping(value = "/myForm",method = RequestMethod.GET)
    public String toString2(HttpServletRequest req, Model model) {
        System.out.println(req.getParameter("color"));
        return "a.html";
    }
    @Scheduled(fixedRate=5000)
    public void MyTask(){
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }
}
