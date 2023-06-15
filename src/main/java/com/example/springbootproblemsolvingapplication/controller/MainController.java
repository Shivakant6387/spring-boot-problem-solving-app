package com.example.springbootproblemsolvingapplication.controller;
import com.example.springbootproblemsolvingapplication.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired
    private  MainService mainService;
    @GetMapping("/")
    public String home(){
        return "index.html";
    }
    @GetMapping("/signup")
    public String showSignupForm() {
        return "signup.html";
    }
    @GetMapping("/login")
    public String login(Model m) {
        return "login.html";
    }

    @PostMapping("/")
    public String processSignupForm(@RequestParam("username") String username,
                                    @RequestParam("userPassword") String password,
                                    Model model) {
        // Perform signup logic, such as storing the user in the database
        // For simplicity, this example does not include database operations

        // Add success message to the model
        model.addAttribute("message", "Signup successful! You can now login.");

        // Return the success page
        return "success.html";
    }
}
