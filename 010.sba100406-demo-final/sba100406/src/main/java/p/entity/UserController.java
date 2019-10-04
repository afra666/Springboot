package p.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//    返回视图
@Controller
//    返回字符串,网址先加值
@RequestMapping(path="/demo")
public class UserController {

    @Autowired
    private  UserRepository userRepository;
    @GetMapping(path = "/add")
    @ResponseBody
    public String addNewUser(@RequestParam String firstname,@RequestParam String lastname){
        User user=new User(firstname,lastname);
        userRepository.save(user);
        return "Saved";
    }
    @GetMapping(path = "/finduser/{lastname}")
    @ResponseBody
    public  String finduser(@PathVariable("lastname") String lastname){
        List<User> userList=userRepository.findByLastName(lastname);
        String users=" ";
        for (User user:userList){users+=user.toString()+"  ";};
        return users;
    }
}
