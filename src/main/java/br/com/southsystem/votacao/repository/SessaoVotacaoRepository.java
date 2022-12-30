package br.com.southsystem.votacao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SessaoVotacaoRepository extends MongoRepository<SessaoVotacaoDocument, String> {

}
