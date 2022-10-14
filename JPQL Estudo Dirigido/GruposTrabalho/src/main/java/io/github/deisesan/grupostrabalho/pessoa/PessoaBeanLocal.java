package io.github.deisesan.grupostrabalho.pessoa;

import javax.ejb.Local;

@Local
public interface PessoaBeanLocal {

    void create(Pessoa pessoa);
    
}
