package br.com.melol.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.melol.dao.IVendaDAO;
import br.com.melol.domain.Venda;
import br.com.melol.domain.Venda.Status;
import br.com.melol.exceptions.DAOException;
import br.com.melol.exceptions.TipoChaveNaoEncontradaException;
import br.com.melol.services.generic.GenericService;

@br.com.melol.service.Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

    IVendaDAO dao;

    @br.com.melol.service.Inject
    public VendaService(IVendaDAO dao) {
        super(dao);
        this.dao = dao;
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Status.CONCLUIDA);
        dao.finalizarVenda(venda);
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Status.CANCELADA);
        dao.cancelarVenda(venda);
    }

    @Override
    public Venda consultarComCollection(Long id) {
        return dao.consultarComCollection(id);
    }

    @Override
    public Venda cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException {
        entity.setStatus(Status.INICIADA);
        return super.cadastrar(entity);
    }



}
