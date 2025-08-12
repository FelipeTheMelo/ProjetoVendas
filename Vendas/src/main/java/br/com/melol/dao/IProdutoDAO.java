package br.com.melol.dao;

import java.util.List;

import br.com.melol.dao.generic.IGenericDAO;
import br.com.melol.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

    List<Produto> filtrarProdutos(String query);

}
