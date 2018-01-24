package com.esliceu.dwes.domain;

/**
 * Created by xavi on 25/01/18.
 */
public class Greet {

    private String say;

    public Greet(String hola) {
        this.say = hola;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}
