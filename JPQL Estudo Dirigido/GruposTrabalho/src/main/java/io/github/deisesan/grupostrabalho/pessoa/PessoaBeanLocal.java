package io.github.deisesan.grupostrabalho.pessoa;

import java.util.List;
import javax.ejb.Local;

@Local
public interface PessoaBeanLocal {

    void create(Pessoa pessoa);

    List<Pessoa> getPessoasQuery();
    List<Pessoa> getPessoasTypedQuery();
    List<Pessoa> getPessoasNamedQuery();
   
    List<Object[]> getNomesQuery();
    List<Object[]> getNomesTypedQuery();
    List<Object[]> getNomesNamedQuery();
    
    List<Object[]> getNomesEnderecosQuery();
    List<Object[]> getNomesEnderecosTypedQuery();
    List<Object[]> getNomesEnderecosNamedQuery();
    
    List<Pessoa> getPessoasAvenidaQuery();
    List<Pessoa> getPessoasAvenidaTypedQuery();
    List<Pessoa> getPessoasAvenidaNamedQuery();
    
    List<Pessoa> getPessoasNaoPracaQuery();
    List<Pessoa> getPessoasNaoPracaTypedQuery();
    List<Pessoa> getPessoasNaoPracaNamedQuery();
    
    List<Object[]> getNomesTelefonesQuery();
    List<Object[]> getNomesTelefonesTypedQuery();
    List<Object[]> getNomesTelefonesNamedQuery();
   
}
