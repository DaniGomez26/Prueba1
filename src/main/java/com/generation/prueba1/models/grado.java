package com.generation.prueba1.models;

public class grado extends curso {
    public Integer grado;

    public grado() {
        super();
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString()+"grado [grado=" + grado + "]";
    }
    
}
