package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador {

    @RequestMapping("/formulario")
    public ModelAndView formulario() {

        return new ModelAndView("form");

    }

    @RequestMapping("/dados")
    public String dados (String nome, String email, String Senha, String Modulo, String preference){

   return nome + ' ' + email + ' ' + Modulo + ' '+ Senha +  ' ' + preference;

    }

}