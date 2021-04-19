package br.com.exemplo.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.exemplo.jpa.dao.MovimentacaoDao;
import br.com.exemplo.jpa.modelo.MediaComData;

public class TestaMediaDiariaDasMovimentacoes {
	public static void main(String[] args) {
		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJPA");
		EntityManager em = emf.createEntityManager();
		
		List<MediaComData> mediaDasMovimentacoes = new MovimentacaoDao(em).getMediaDiariaDasMovimentacoes();
		
		for (MediaComData resultado : mediaDasMovimentacoes) {
			System.out.println("A média das movimentacoes do dia " + resultado.getDia() + "/" + resultado.getMes() + "São: " + resultado.getValor());
		}
	}

}
