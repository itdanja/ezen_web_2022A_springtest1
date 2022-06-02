package EZENWEB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Indexcontroller {


    @GetMapping("/")
    public String main(Model model ){
        model.addAttribute("data" , "유재석");
        return "main";
    }
    @GetMapping("/getdata")
    @ResponseBody
    public String getdata(){
        return "강호동";
    }
}
