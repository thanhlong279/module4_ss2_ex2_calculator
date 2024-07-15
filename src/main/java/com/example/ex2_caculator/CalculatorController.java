package com.example.ex2_caculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping
    public String calculator() {
        return "index";
    }

    @PostMapping("calculator")
    public String calculatorPost(@RequestParam("x") double x,
                                @RequestParam("y") double y,
                                @RequestParam("operator") String operator,
                                Model model) {
        double result = 0;
        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}