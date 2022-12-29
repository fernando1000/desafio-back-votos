package br.com.southsystem.votacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.southsystem.votacao.service.PautaService;

@RestController
@RequestMapping("/pautas")
public class PautaController {

	@Autowired
	private PautaService service;
	
	@PostMapping
	public ResponseEntity<Void> cadastraPauta(@Valid @RequestBody CadastroPautaRequest request) {
		
		service.cadastraPauta(request);
		
		return ResponseEntity.created(null).build();
	}

}
