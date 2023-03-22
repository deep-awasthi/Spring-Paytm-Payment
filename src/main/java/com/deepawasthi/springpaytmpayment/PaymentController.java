package com.deepawasthi.springpaytmpayment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
