package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Pedido;

public class PedidoDAO {
	
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}
	
	public PedidoDAO(EntityManager em) {
		this.em = em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}
}
