package io.github.deisesan.grupostrabalho.atuacao;

import javax.ejb.Local;

@Local
public interface AtuacaoBeanLocal {

    void create(Atuacao atuacao);
    
}
