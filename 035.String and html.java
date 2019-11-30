package p;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class App {
    @GetMapping("/str")
    @ResponseBody
    public String str() {
        return "str123";
    }
    @GetMapping("/html")
    public String html() {
        return "a";
    }
}
