package br.com.glandata.glandata.jpa.main;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.glandata.glandata.jpa.dao.ProdutoDao;
import br.com.glandata.glandata.jpa.model.Categoria;
import br.com.glandata.glandata.jpa.model.Produto;
import br.com.glandata.glandata.jpa.util.JPAUtil;

public class CadatroDeProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Moto G468", "Smartfhone", new BigDecimal("1500.00"), Categoria.ELETRONICOS);
		//produto.setNome("Moto G868");
		//produto.setDescricao("Smartfhone");
		//produto.setPreco(new BigDecimal("1500.00"));
		//produto.setCategoria(Categoria.ELETRONICOS);
		
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("glandata");	
		EntityManager em = JPAUtil.getentEntityManager();
		
		try {
			em.getTransaction().begin();
			
			ProdutoDao produtoDao = new ProdutoDao(em);

			
			produtoDao.cadastrar(produto);
			
			em.getTransaction().commit();
	
		} catch (Exception e) {
			System.out.println("erro  ao inserir: " + e.getMessage());
		}finally {
			em.close();
		}
		
	}

}
