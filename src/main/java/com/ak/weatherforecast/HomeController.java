package com.ak.weatherforecast;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //    @GetMapping("/")
//    public String home(ModelMap modelMap){
//        modelMap.put("a", 20);
//        return "home";
//    }
    @GetMapping("/")
    public String getForm() {
        return "weather";
    }
}
