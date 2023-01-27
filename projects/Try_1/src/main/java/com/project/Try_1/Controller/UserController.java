package com.project.Try_1.Controller;

import com.project.Try_1.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserDAO userDAO;
    @GetMapping()
    public String Mainpage(@RequestParam(value = "username", required = false) String username, @RequestParam (value = "password" , required = false) String password, Model model){
        if(userDAO.findUser(username)==null){
            return "registration";
        }else{
            userDAO.AddUser(username,password);
            model.addAttribute("message", "Успешная регистрация");

        }
        return "qwe";
    }
    @GetMapping("/Registration")
    public String Registration(@RequestParam(value = "userName", required = false) String username, @RequestParam (value = "Password" , required = false) String password,Model model){
        userDAO.AddUser(username,password);
        model.addAttribute("message", "Регистрация успешна");
        return "registration";
    }
    @GetMapping("/error")
    public String Error(){
        return "error";
    }
}
