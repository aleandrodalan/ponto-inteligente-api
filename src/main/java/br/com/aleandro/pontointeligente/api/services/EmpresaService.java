package br.com.aleandro.pontointeligente.api.services;

import java.util.Optional;

import br.com.aleandro.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	Optional<Empresa> buscarPorCnpj(String cpnj);
	
	Empresa persistir(Empresa empresa);
}
