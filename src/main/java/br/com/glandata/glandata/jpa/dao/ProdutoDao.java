package br.com.glandata.glandata.jpa.dao;

import javax.persistence.EntityManager;

import br.com.glandata.glandata.jpa.model.Produto;

public class ProdutoDao {
	
	private EntityManager em;
	
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Produto produto) {
		
		em.persist(produto);
	}

}
