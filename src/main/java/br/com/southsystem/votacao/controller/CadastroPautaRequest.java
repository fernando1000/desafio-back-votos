package br.com.southsystem.votacao.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CadastroPautaRequest {

	@NotNull
	private Integer numeroPauta;
	
	@NotEmpty
	private String assuntoPauta;
}
