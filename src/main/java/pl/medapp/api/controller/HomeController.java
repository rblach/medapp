package pl.medapp.api.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping(value = {"/","/home"})
    public String home() {
        logger.info("Entering the showHomePage method");
        return "medapphome";
    }
}