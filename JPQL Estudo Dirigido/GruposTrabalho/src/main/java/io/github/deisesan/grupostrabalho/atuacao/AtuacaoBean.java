package io.github.deisesan.grupostrabalho.atuacao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AtuacaoBean implements AtuacaoBeanLocal {
    
    @PersistenceContext
    private EntityManager em;
   
    @Override
    public void create(Atuacao atuacao) {
        em.persist(atuacao);
    }
}
