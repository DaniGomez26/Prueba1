package com.generation.prueba1.models;

public class curso {
    public String nomCurso;

    public curso() {
    }

    public curso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public String getnomCurso() {
        return nomCurso;
    }

    public void setnomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public void mensjCurso (){
        System.out.print("El "+ nomCurso+" es el mejor curso! :D");
    }

    @Override
    public String toString() {
        return "[" + nomCurso + "]";
    }
    
}
