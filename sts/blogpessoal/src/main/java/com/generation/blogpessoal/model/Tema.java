package com.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Faz com que essa classe seja reconhecida como uma tabela do nosso banco de dados.
@Table(name = "tb_temas")
public class Tema {
	
	@Id //Indica que é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long id;
	
	@NotBlank (message = "O atributo é obrigatório")
	private String descricao;
								//Cascade informa que se o tema for apagado todas as postagens são apagadas
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE) // mapped dá um nome ao relacionamento
	@JsonIgnoreProperties("tema")
	private List <Postagem> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	

}
