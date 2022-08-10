package com.example.tutoriais.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bd_tutoriais")
public class Tutoriais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@NotNull
	@Column(nullable = false, length = 100)
	private String tituloTutorial;

	@NotBlank
	@NotNull
	@Column(nullable = false, length = 100)
	private String descricaoTutorial;

	@NotBlank
	@NotNull
	@Column(nullable = false, length = 100)
	private String situacaoPublicacao;
}
