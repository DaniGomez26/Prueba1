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

    public String arte(Boolean ramoArte){
        if(ramoArte=true){
            return "Lxs niños de este curso tienen Arte entre sus materias:)";
            }else{
            return "Lxs niñxs de este curso no tienen Arte :c";
            }
        }
    

    @Override
    public String toString() {
        return super.toString()+"materia [materia=" + materia + "]";
    }
    

    
}
