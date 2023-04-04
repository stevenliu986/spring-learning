package com.springlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: HomeController
 * Package: com.springlearning.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 4/04/2023
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
