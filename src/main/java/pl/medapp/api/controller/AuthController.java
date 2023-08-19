package pl.medapp.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.medapp.api.dto.UserRegistrationDto;
import pl.medapp.business.RegistrationService;

@Controller
@AllArgsConstructor
public class AuthController {
    private final RegistrationService registrationService;

    @GetMapping(value = "/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userRegistrationDto", new UserRegistrationDto());
        return "registration_form";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("userRegistrationDto") UserRegistrationDto userRegistrationDto) {
        registrationService.registerUser(userRegistrationDto);
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}