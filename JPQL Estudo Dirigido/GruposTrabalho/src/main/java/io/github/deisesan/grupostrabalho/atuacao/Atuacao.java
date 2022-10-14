package io.github.deisesan.grupostrabalho.atuacao;

import io.github.deisesan.grupostrabalho.grupo.Grupo;
import io.github.deisesan.grupostrabalho.pessoa.Pessoa;
import javax.json.bind.annotation.JsonbTransient;
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
    @JsonbTransient
    private Pessoa pessoa;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "grupo_id")
    @JsonbTransient
    private Grupo grupo;
    
    //Constructor 
    public Atuacao() {    
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Atuacao{" + "id=" + id + ", inicio=" + inicio + ", termino=" + termino + ", pessoa=" + pessoa + ", grupo=" + grupo + '}';
    }
}
