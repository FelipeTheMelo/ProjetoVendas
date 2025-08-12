package br.com.melol.service;

import java.util.List;

import br.com.melol.domain.Produto;
import br.com.melol.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}
