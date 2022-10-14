package io.github.deisesan.grupostrabalho.grupo;

import io.github.deisesan.grupostrabalho.atuacao.Atuacao;
import io.github.deisesan.grupostrabalho.pessoa.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity (name = "Grupo")
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    
    @Column(length = 65, nullable = false)
    private String nome;
    
    private Boolean ativo;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "lider_id")
    @JsonbTransient
    private Pessoa lider;
    
    @OneToMany(mappedBy="grupo", cascade = CascadeType.ALL, orphanRemoval=true)
    @JsonbTransient
    private List<Atuacao> atuacoes;
    
    //Constructor 
    public Grupo() {
        this.ativo = true;
        this.atuacoes = new ArrayList<>();
    }
    
    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getLider() {
        return lider;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atuacao> atuacoes) {
        this.atuacoes = atuacoes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nome=" + nome + ", ativo=" + ativo + ", lider=" + lider + ", atuacoes=" + atuacoes + '}';
    }
}
