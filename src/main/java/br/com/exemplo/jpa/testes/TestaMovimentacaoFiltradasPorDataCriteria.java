package br.com.exemplo.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.exemplo.jpa.dao.MovimentacaoDao;
import br.com.exemplo.jpa.modelo.Movimentacao;

public class TestaMovimentacaoFiltradasPorDataCriteria {
	
	public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJPA");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao dao = new MovimentacaoDao(em);
		List<Movimentacao> movimentacaoesFiltradasPorData = dao.getMovimentacoesFiltradasPorData(null, null, null);
		for (Movimentacao movimentacao : movimentacaoesFiltradasPorData) {
			System.out.println("Descricao -> " + movimentacao.getDescricao());
			System.out.println("Valor -> " + movimentacao.getValor());
			System.out.println("------------------------------------");
		}
	}
}