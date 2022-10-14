package io.github.deisesan.grupostrabalho.pessoa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaBean implements PessoaBeanLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void create(Pessoa pessoa) {
        em.persist(pessoa);
    }
}
