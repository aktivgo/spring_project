package controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public @NotNull String home(@NotNull Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
}