package br.com.exemplo.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.exemplo.jpa.modelo.Conta;

public class TestaRelatorioDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJPA");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c from Conta c left join fetch c.movimentacoes";
//		String jpql = "select distinct c from Conta c left join fetch c.movimentacoes"; //para evitar elementos repetidos

		TypedQuery<Conta> query = em.createQuery(jpql, Conta.class);
		
		List<Conta> contas = query.getResultList();
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Agencia: " + conta.getAgencia());
			System.out.println("Numero: " + conta.getNumero());
			System.out.println("Movimentacoes: " + conta.getMovimentacoes());
		}
	}
}
