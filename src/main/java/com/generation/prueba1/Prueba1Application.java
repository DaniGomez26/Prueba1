package com.generation.prueba1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class Prueba1Application {
//funcion promedio, no supe como hacer todo en el  main :c
public static Double promedioNotas (ArrayList <Double> arregloNotas){
	Double sumador=0.0;
		for(int i = 1; i < arregloNotas.size(); i++){
			sumador+=arregloNotas.get(i);
		}
		return sumador/arregloNotas.size();
}

	public static void main(String[] args) {
	/*Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante. 
La funcion promedio esta fuera del main y la llmaré en el main*/

//declaro variables e inicializo Scanner y ArrayList
		int cantAlum;
		int cantNotas;
		String nomAlum;
		Double promAlum;
		Double nota= 0.0;
		Scanner dato = new Scanner(System.in);
		ArrayList<Double> arregloNotas = new ArrayList<Double>();

		//Pido info al usuario de cuantos alumnos y notas va a ingresar y que notas son
//
		do{
		System.out.println("Ingrese la cantidad de alumnos que hay en el curso");
		cantAlum = dato.nextInt();
		if (cantAlum<=0){
			System.out.println("Ingrese una cantidad mayor a 0");
		}
		}while(cantAlum <=0);

		do {
			System.out.println("¿Cuantas notas va a ingresar?");
			cantNotas=dato.nextInt();
			if (cantNotas<=0){
			System.out.println("Ingrese una cantidad mayor a 0");
			}
		} while (cantNotas<=0);

		for(int i = 1; i<=cantAlum; i++ ){
			System.out.println("Ingrese las notas:");
			nota = dato.nextDouble();
			arregloNotas.add(nota);
		}
		//voy a recorrer el arreglo e identificar cual es la nota mas alta y la mas baja

		Double alta= 0.0;
		Double baja= 0.0;

		for (int x=1; x<=arregloNotas.size(); x++){
			if(arregloNotas.get(x) > alta){
				alta = nota;
			}
			if(arregloNotas.get(x) < baja){
				baja = nota;
			}
		}

		

	}
}