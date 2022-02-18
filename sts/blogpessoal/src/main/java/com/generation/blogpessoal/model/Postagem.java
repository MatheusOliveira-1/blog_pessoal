package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity // Entidade é uma tabela, anotação Entity informa que essa classe irá virar uma tabela no DB.
@Table(name = "tb_postagens") // Nome da tabela, caso não for informado o nome da tabela será o mesmo da classe
public class Postagem {
	
	@Id // Indica que este atributo será a chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Indica auto_incrimente
	private Long id;
	
	@NotBlank(message = "O atributo título é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo título deve conter entre 5 e 100 caractéres")
	private String titulo;
	
	@NotBlank(message = "O atributo texto é obrigatório!")
	@Size(min = 5, max = 1000, message = "O atributo texto deve conter entre 5 e 1000 caractéres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	//Não é ncessário criar o método Contrutor
	
	//Na classe Model é obrigatório criar os GETs e SETs dos atributos.
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	

	
}
