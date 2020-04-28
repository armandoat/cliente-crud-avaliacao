package br.com.tokiomarine.service;

import br.com.tokiomarine.domain.Endereco;

public interface ViacepService {
	
	Endereco buscarCepPorNumeroCep(String cep);
}
