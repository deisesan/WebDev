package io.github.deisesan.grupostrabalho.telefone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "Telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    
    private Byte ddd;
    
    private Integer numero;
    
    //Getters 
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Byte getDdd() {
        return ddd;
    }

    public Integer getNumero() {
        return numero;
    }
    
    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
