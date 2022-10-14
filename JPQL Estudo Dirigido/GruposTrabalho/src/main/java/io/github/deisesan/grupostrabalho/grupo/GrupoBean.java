package io.github.deisesan.grupostrabalho.grupo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GrupoBean implements GrupoBeanLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void create(Grupo grupo) {        
        em.persist(grupo);
    }
}
