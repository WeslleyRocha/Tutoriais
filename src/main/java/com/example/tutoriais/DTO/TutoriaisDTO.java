package com.example.tutoriais.DTO;

import lombok.Data;

@Data
public class TutoriaisDTO {

	private Long id;
	private String tituloTutorial;
	private String descricaoTutorial;
	private String situacaoPublicacao;
}
