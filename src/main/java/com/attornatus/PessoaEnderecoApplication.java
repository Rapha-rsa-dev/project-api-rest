package com.attornatus;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API de cadastro de pessoas e endereços. 
 * @author  RaphaDev
 */
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class PessoaEnderecoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PessoaEnderecoApplication.class, args);
    }
}
