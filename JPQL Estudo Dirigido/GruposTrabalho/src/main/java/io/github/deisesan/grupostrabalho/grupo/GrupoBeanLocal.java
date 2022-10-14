package io.github.deisesan.grupostrabalho.grupo;

import java.util.List;
import javax.ejb.Local;

@Local
public interface GrupoBeanLocal {

    void create(Grupo grupo);
    
    List<Grupo> getGruposNaoAtivosQuery();
    List<Object[]> getNomesLideresQuery();
    List<Object[]> getNomesMembrosDistintosQuery();
    List<Object[]> getNomesMembrosNaoDataTerminoQuery();
    List<Object[]> getNomesLideresMembrosQuery();    
}
