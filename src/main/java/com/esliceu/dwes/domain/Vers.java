package com.esliceu.dwes.domain;

import javax.persistence.*;

/**
 * Created by xavi on 25/01/18.
 * CREATE TABLE `vers` (
 `idvers` int(11) NOT NULL AUTO_INCREMENT,
 `vers` varchar(1000) NOT NULL,
 `ordre` int(11) NOT NULL,
 `glosa_idglosa` int(11) NOT NULL,
 PRIMARY KEY (`idvers`),
 KEY `fk_vers_glosa_idx` (`glosa_idglosa`),
 CONSTRAINT `fk_vers_glosa` FOREIGN KEY (`glosa_idglosa`) REFERENCES `glosa` (`idglosa`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=549 DEFAULT CHARSET=utf8;
 */
@Entity(name="vers")
public class Vers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idvers")
    private Integer id;

    @Column(name = "vers")
    private String vers;

    @Column(name = "ordre")
    private Integer posicio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    public Integer getPosicio() {
        return posicio;
    }

    public void setPosicio(Integer posicio) {
        this.posicio = posicio;
    }
}
