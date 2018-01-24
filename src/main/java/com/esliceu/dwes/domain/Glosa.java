package com.esliceu.dwes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xavi on 25/01/18.
 */
@Entity(name = "glosa")
public class Glosa {

    @Id
    @Column(name = "idglosa")
    private Integer id;

    @Column(name = "titol")
    private String titol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }
}
