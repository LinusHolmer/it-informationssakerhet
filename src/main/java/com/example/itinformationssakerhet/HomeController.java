package com.example.itinformationssakerhet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "userpage";
    }

    @GetMapping("/admin")
    public String admin(){
        return "adminpage";
    }

    @GetMapping("/public")
    public String publicPage(){
        return "publicpage";
    }
}
