/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/addUser")
    public String sendForm(User user) {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {

        return "showMessage";
    }
}
