package br.com.tokiomarine.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.tokiomarine.domain.Cliente;

public interface ClienteService {
	
	Page<Cliente> buscarTodos(Pageable pageable);
	Cliente incluir(Cliente cliente);
	Cliente atualizar(Cliente cliente);
	void excluir(Long id);
}
