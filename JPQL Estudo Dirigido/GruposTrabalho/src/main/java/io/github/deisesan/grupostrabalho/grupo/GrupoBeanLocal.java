package io.github.deisesan.grupostrabalho.grupo;

import javax.ejb.Local;

@Local
public interface GrupoBeanLocal {

    void create(Grupo grupo);
    
}
