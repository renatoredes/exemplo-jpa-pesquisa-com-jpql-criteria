package br.com.exemplo.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.exemplo.jpa.modelo.Conta;
import br.com.exemplo.jpa.modelo.Movimentacao;

public class TestaMovimentacaoConta {
	
	public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJPA");
		EntityManager em = emf.createEntityManager();
		
		Movimentacao movimentacao = em.find(Movimentacao.class, 1L);
		Conta conta = movimentacao.getConta();
		
		int quantidadeDeMovimentacoes = conta.getMovimentacoes().size();
		
		System.out.println("Quantidade de movimentacoes: " + quantidadeDeMovimentacoes);
		System.out.println("Titular da conta: " + conta.getTitular());
	}

}
