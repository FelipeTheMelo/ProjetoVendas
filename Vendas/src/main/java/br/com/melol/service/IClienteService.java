package br.com.melol.service;

import java.util.List;

import br.com.melol.domain.Cliente;
import br.com.melol.exceptions.DAOException;
import br.com.melol.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);

}
