package br.com.melol.dao;

import java.util.List;

import br.com.melol.dao.generic.IGenericDAO;
import br.com.melol.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

    List<Cliente> filtrarClientes(String query);

}
