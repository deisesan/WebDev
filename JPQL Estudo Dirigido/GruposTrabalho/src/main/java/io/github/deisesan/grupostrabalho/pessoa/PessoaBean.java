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
    
    @Override
    public List<Object[]> getNomesQuery() {
        Query result = em.createQuery("SELECT p.nome FROM Pessoa p");
        return (List<Object[]>) result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p.nome FROM Pessoa p", Object[].class);
        return result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesNamedQuery() {
        return em.createNamedQuery("Pessoa.getNomesNamedQuery", Object[].class).getResultList();
    }
    
    @Override
    public List<Object[]> getNomesEnderecosQuery() {
        Query result = em.createQuery("SELECT p.nome, p.endereco FROM Pessoa p");
        return (List<Object[]>) result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesEnderecosTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p.nome, p.endereco FROM Pessoa p", Object[].class);
        return result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesEnderecosNamedQuery() {
        return em.createNamedQuery("Pessoa.getNomesEnderecosNamedQuery", Object[].class).getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasAvenidaQuery() {
        Query result = em.createQuery("SELECT p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1");
        return (List<Pessoa>) result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasAvenidaTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1", Pessoa.class);
        return result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasAvenidaNamedQuery() {
        return em.createNamedQuery("Pessoa.getPessoasAvenidaNamedQuery", Pessoa.class).getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasNaoPracaQuery() {
        Query result = em.createQuery("SELECT p FROM Pessoa p WHERE NOT p.endereco.tipoLogradouro = 2");
        return (List<Pessoa>) result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasNaoPracaTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p FROM Pessoa p WHERE NOT p.endereco.tipoLogradouro = 2", Pessoa.class);
        return result.getResultList();
    }
    
    @Override
    public List<Pessoa> getPessoasNaoPracaNamedQuery() {
        return em.createNamedQuery("Pessoa.getPessoasNaoPracaNamedQuery", Pessoa.class).getResultList();
    }
    
    @Override
    public List<Object[]> getNomesTelefonesQuery() {
        Query result = em.createQuery("SELECT p.nome, t FROM Pessoa p JOIN p.telefones t");
        return (List<Object[]>) result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesTelefonesTypedQuery() {
        TypedQuery result = em.createQuery("SELECT p.nome, t FROM Pessoa p JOIN p.telefones t", Object[].class);
        return result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesTelefonesNamedQuery() {
        return em.createNamedQuery("Pessoa.getNomesTelefonesNamedQuery", Object[].class).getResultList();
    }
}
