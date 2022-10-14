package io.github.deisesan.grupostrabalho.pessoa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
public class PessoaBean implements PessoaBeanLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void create(Pessoa pessoa) {
        em.persist(pessoa);
    }

    @Override
    public List<Pessoa> getPessoasQuery() {
        Query result = em.createQuery("SELECT p FROM Pessoa p");
        return (List<Pessoa>) result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        return result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasNamedQuery() {
        return em.createNamedQuery("Pessoa.getPessoasNamedQuery", Pessoa.class).getResultList();
    }
}
