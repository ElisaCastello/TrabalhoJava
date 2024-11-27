package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AberturaMEIController {

    @GetMapping("/")
    public String home() {
        return "index";  // Retorna o template "index.html"
    }

    @PostMapping("/submeter")
    public String submeter(
            @RequestParam String nome,
            @RequestParam String cpf,
            @RequestParam String senhaGov,
            @RequestParam String tituloEleitor,
            @RequestParam String enderecoResidencial,
            @RequestParam String cepResidencial,
            @RequestParam String enderecoComercial,
            @RequestParam String cepComercial,
            @RequestParam String cnae,
            @RequestParam String email,
            @RequestParam String telefone,
            Model model) {

        // Passa os dados para o template
        model.addAttribute("nome", nome);
        model.addAttribute("cpf", cpf);
        model.addAttribute("senhaGov", senhaGov);
        model.addAttribute("tituloEleitor", tituloEleitor);
        model.addAttribute("enderecoResidencial", enderecoResidencial);
        model.addAttribute("cepResidencial", cepResidencial);
        model.addAttribute("enderecoComercial", enderecoComercial);
        model.addAttribute("cepComercial", cepComercial);
        model.addAttribute("cnae", cnae);
        model.addAttribute("email", email);
        model.addAttribute("telefone", telefone);

        return "resultado";  // Retorna o template "resultado.html"
    }
}
