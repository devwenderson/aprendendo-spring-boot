package br.com.gerencia_financas.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gerencia_financas.repository.CarteiraRepository;

@Controller
public class CarteiraController {
    
    private final CarteiraRepository carteiraRepository;

    public CarteiraController(CarteiraRepository carteiraRepository) {
        this.carteiraRepository = carteiraRepository;
    }

    @GetMapping("/carteira/listar/")
    public ModelAndView list() {
        return new ModelAndView(
            "carteira/listar",
            Map.of("carteiras", carteiraRepository.findAll())
        );
    }
}
