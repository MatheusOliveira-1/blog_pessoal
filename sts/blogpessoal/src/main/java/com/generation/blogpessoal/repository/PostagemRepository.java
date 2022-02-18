package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository //Esta Interface será do tipo repositório
public interface PostagemRepository extends JpaRepository <Postagem, Long>{
	
	List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
					//SELECT * FROM tb_postagens WHERE titulo LIKE "%...%"; IGNORANDO MAIÚS OU MINUS
					
}
