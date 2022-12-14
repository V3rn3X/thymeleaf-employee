package pl.sda.thymeleaf.employee.starter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StarterController {

    @GetMapping("/starter/{name}")
    public String starterPage(@PathVariable final String name, Model model){
        model
                .addAttribute("name", name)
                .addAttribute("message", "Hello");
        return "starter";
    }
}
