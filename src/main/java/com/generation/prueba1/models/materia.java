package com.generation.prueba1.models;

public class materia extends curso {
    public Boolean materia;

    public materia() {
        super();
    }
    public materia(Boolean materia) {
        this.materia = materia;
    }

    public materia(String alumnos, Boolean materia) {
        super(alumnos);
        this.materia = materia;
    }
    @Override
    public String toString() {
        return super.toString()+"materia [materia=" + materia + "]";
    }
    

    
}
