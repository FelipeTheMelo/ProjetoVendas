package br.com.melol.service;

import br.com.melol.dao.generic.IGenericDAO;
import br.com.melol.domain.Venda;
import br.com.melol.exceptions.DAOException;
import br.com.melol.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long>{

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    /// Usando este m&eacute;todo para evitar a exception org.hibernate.LazyInitializationException
    /// Ele busca todos os dados de objetos que tenham colletion pois a mesma por default &eacute; lazy
    /// Mas voc&ecirc; pode configurar a propriedade da collection como fetch = FetchType.EAGER na anota&ccedil;&atilde;o @OneToMany e usar o consultar gen&eacute;rico normal
    ///
    /// OBS: N&atilde;o &eacute; uma boa pr&aacute;tica utiliar FetchType.EAGER pois ele sempre ir&aacute; trazer todos os objetos da collection
    /// mesmo sem precisar utilizar.
    ///
    /// @param id
    /// @return
    /// @see VendaJpa produtos
    private Venda consultarComCollection(Long id) {
        return null;
    }

}
