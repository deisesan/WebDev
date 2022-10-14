package io.github.deisesan.grupostrabalho.grupo;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GrupoBean implements GrupoBeanLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void create(Grupo grupo) {        
        em.persist(grupo);
    }
    
    @Override
    public List<Grupo> getGruposNaoAtivosQuery() {
        Query result = em.createQuery("SELECT grupo FROM Grupo grupo WHERE grupo.ativo = false");
        return (List<Grupo>) result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesLideresQuery() {
        Query result = em.createQuery("SELECT grupo.nome, lider.nome FROM Grupo grupo JOIN grupo.lider lider");
        return (List<Object[]>) result.getResultList();
    }

    @Override
    public List<Object[]> getNomesMembrosDistintosQuery() {
        Query result = em.createQuery("SELECT grupo.nome, count(DISTINCT atuacao.pessoa) FROM Grupo grupo JOIN grupo.atuacoes atuacao GROUP BY grupo");
        return (List<Object[]>) result.getResultList();
    }

    @Override
    public List<Object[]> getNomesMembrosNaoDataTerminoQuery() {
        Query result = em.createQuery("SELECT grupo.nome, atuacao.pessoa.nome FROM Grupo grupo JOIN grupo.atuacoes atuacao WHERE atuacao.termino IS NULL");
        return (List<Object[]>) result.getResultList();
    }
    
    @Override
    public List<Object[]> getNomesLideresMembrosQuery() {
        Query result = em.createQuery("SELECT grupo.nome, grupo.lider.nome, atuacao.pessoa.nome FROM Grupo grupo JOIN grupo.atuacoes atuacao ORDER BY grupo.nome, grupo.lider.nome, atuacao.pessoa.nome");
        return (List<Object[]>) result.getResultList();
    }

}
