package io.github.deisesan.grupostrabalho.grupo;

import io.github.deisesan.grupostrabalho.pessoa.Pessoa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name = "Grupo")
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    
    @Column(length = 65, nullable = false)
    private String nome;
    
    private Boolean ativo = true;
    
    @OneToOne
    @JoinColumn(name = "lider_id")
    private Pessoa lider;
    
    //Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Pessoa getLider() {
        return lider;
    }
    
    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }
}
