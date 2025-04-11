package com.wenastardes.wenastardes.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController



public class holamundoController {

    
    @GetMapping("/hola")
    public String holamundo(){
        return "FARNANDO!!!!!!!!!!";

        
    }



}
