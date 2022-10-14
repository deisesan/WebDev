package io.github.deisesan.grupostrabalho.pessoa;

import java.util.List;
import javax.ejb.Local;

@Local
public interface PessoaBeanLocal {

    void create(Pessoa pessoa);

    List<Pessoa> getPessoasQuery();
    List<Pessoa> getPessoasTypedQuery();
    List<Pessoa> getPessoasNamedQuery();
    
}
