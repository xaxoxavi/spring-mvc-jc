package com.esliceu.dwes.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by xavi on 25/01/18.
 * CREATE TABLE `glosa` (
 `idglosa` int(11) NOT NULL AUTO_INCREMENT,
 `titol` varchar(45) NOT NULL,
 PRIMARY KEY (`idglosa`)
 ) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8;
 */

@Entity(name = "glosa")
public class Glosa {

    @Id
    @Column(name = "idglosa")
    private Integer id;

    @Column(name = "titol")
    private String titol;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "glosa_idglosa")
    private Set<Vers> versos;

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

    public Set<Vers> getVersos() {
        return versos;
    }

    public void setVersos(Set<Vers> versos) {
        this.versos = versos;
    }
}
