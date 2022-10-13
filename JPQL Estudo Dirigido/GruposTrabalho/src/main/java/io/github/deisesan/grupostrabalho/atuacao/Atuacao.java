package io.github.deisesan.grupostrabalho.atuacao;

import io.github.deisesan.grupostrabalho.grupo.Grupo;
import io.github.deisesan.grupostrabalho.pessoa.Pessoa;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity (name = "Atuacao")
public class Atuacao implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate inicio;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate termino;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "grupo_id")
    private Grupo grupo;
    
    //Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Grupo getGrupo() {
        return grupo;
    }
    
    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }   
}
