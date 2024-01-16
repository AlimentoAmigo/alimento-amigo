package com.generation.alimentoamigo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5,max = 255, message = "O tipo deve ter no minímo 5 caracteres e no máximo 255")
	@NotBlank(message = "Atributo tipo é obrigatorio")
	private String tipo;
	
	@Size(min=10,max = 255, message = "A Descrição deve ter no minímo 10 caracteres e no máximo 255")
	@NotBlank(message = "Atributo Descrição é obrigatorio")
	private String descricao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	


}
