package com.project.spring.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.course.entities.User;

@RestController
//caminho para UserResource
@RequestMapping(value = "/users")
public class UserResource {

	// metodo para acessar os usuarios, retorna respostas de requisição web
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		// retornar respota com sucesso.
		return ResponseEntity.ok().body(u);
	}
}
