package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private UsuarioRepository repository; // Injeta a ferramenta de salvar no banco

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! O Spring Boot está rodando.";
    }

    @GetMapping("/add1")
    public String addUsuario() {
        Usuario novo = new Usuario();
        novo.setNome("Sophia");
        novo.setEmail("ADMIN@gmail.com");
		novo.setSenha("PICLES");

        repository.save(novo); // Comando que envia pro Docker
        return "Usuário salvo com sucesso no banco!";
    }
}