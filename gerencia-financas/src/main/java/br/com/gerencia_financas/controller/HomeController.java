package br.com.gerencia_financas.controller;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // @RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping
    public ModelAndView home() {
        var modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "Wenderson"); // Envia objeto único (<chave>, <valor>)
        return modelAndView;
    }
}
