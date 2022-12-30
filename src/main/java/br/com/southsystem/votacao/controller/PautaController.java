package br.com.southsystem.votacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.southsystem.votacao.service.PautaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Pauta", description = "Realiza operações relacionadas a pauta de uma assembléia")
@RestController
@RequestMapping("/v1/pautas")
public class PautaController {

	@Autowired
	private PautaService service;
	
	@Operation(summary = "Cadastra uma nova pauta")
	@PostMapping
	public ResponseEntity<Void> cadastraPauta(@Valid @RequestBody CadastroPautaRequest request) {
		
		service.cadastraPauta(request);
		
		return ResponseEntity.created(null).build();
	}

}
