package com.sistemas.resultados.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultadoController {
	
	@GetMapping("/resultado/{numero}")
	public String mostrarResultados(@PathVariable float numero) {
		return "El resultado es: " + numero;
	}
}
