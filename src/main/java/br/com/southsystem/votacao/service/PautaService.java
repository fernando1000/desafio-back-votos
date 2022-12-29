package br.com.southsystem.votacao.service;

import org.springframework.stereotype.Service;

import br.com.southsystem.votacao.controller.CadastroPautaRequest;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PautaService {

	public void cadastraPauta(CadastroPautaRequest request) {

		log.info("salvar a paula {}", request);
	}
}
