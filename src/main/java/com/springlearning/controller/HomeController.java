package com.springlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HomeController
 * Package: com.springlearning.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 4/04/2023
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
