package br.com.southsystem.votacao.controller;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CadastroSessaoVotacaoRequest {

	@NotNull
	private Integer numeroPauta;

	private String dataLimite;
}
