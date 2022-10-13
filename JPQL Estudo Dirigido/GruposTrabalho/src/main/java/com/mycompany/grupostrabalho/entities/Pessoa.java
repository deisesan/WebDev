package com.mycompany.grupostrabalho.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Getters
    public Long getId() {
        return id;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
}
