package com.programando.elevandonumeroaoquadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/eleva-ao-quadrado")
public class ElevandoNumeroAoQuadradoApplication {

	@GetMapping("/{numero}")
	public int elevaAoQuadrado(@PathVariable int numero){
		int resultado = (int) Math.pow(numero,2);
		return resultado;
	}
	public static void main(String[] args) {
		SpringApplication.run(ElevandoNumeroAoQuadradoApplication.class, args);
	}
}
