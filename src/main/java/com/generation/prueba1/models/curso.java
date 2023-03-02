package com.generation.prueba1.models;

public class curso {
    public String alumnos;

    public curso() {
    }

    public curso(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public void mensjCurso (){
        System.out.print("Son el mejor curso! :D");
    }

    @Override
    public String toString() {
        return "curso [alumnos=" + alumnos + "]";
    }
    
}
