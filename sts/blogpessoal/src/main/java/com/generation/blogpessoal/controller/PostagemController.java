package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") // Configura a comunicação entre o Front e o Backend que podem estar rodando em servidores diferentes
public class PostagemController {
	
	@Autowired // Instancia o objeto automaticamente pelo Spring
	private PostagemRepository postagemRepository; 
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() { //Vai retornar uma lista do que está na classe postagem
		
	return	ResponseEntity.ok(postagemRepository.findAll());
	}
	

}
