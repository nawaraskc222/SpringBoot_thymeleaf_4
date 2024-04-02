package com.SpringBoot_thymeleaf_4.SpringBoot_thymeleaf_4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YourController {

    @GetMapping("/")
    public String yourHandlerMethod(Model model) {
    	
    	
    	 String[] tablerow = {"ID","Name", "Email","phone"};
         model.addAttribute("tablerow", tablerow);
         
         
        String[][] tableData = {
            {"1","Nawaras kc", "Nawaras@gmail.com","217"},
            {"2","Ujjwol kc", "Ujjwol@gmail.com","117"}
        };
        model.addAttribute("tableData", tableData);
        return "index"; // assuming yourTemplate is your HTML template file name
    }
}
