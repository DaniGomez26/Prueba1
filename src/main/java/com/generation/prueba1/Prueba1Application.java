package com.generation.prueba1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import com.generation.prueba1.models.curso;
import com.generation.prueba1.models.grado;
import com.generation.prueba1.models.materia;

@SpringBootApplication
public class Prueba1Application {
//funcion promedio, no supe como hacer todo en el  main :c
public static Double promedioNotas (ArrayList <Double> arregloNotas){
	Double sumador=0.0;
		for(int i = 0; i < arregloNotas.size(); i++){
			sumador+=arregloNotas.get(i);
		}
		return sumador/arregloNotas.size();
}

public static void notas (ArrayList<Double>arregloNotas){
	Double alta= 0.0;
	Double baja= arregloNotas.get(0);
	

	for(Double nota : arregloNotas){
		if(nota > alta){
			alta = nota;
		}
		if(nota < baja){
			baja = nota;
		}
	}
	Double promedio =promedioNotas(arregloNotas);
	System.out.println("La nota mas baja es: "+baja);
	System.out.println("La nota mas alta es: "+alta);
	//System.out.println("El promedio es: "+promedio);
}

	public static void main(String[] args) {

System.out.println("*****************************************Se ingresan notas,nombre****************************");
//declaro variables e inicializo Scanner y ArrayList
		int cantAlum;
		int cantNotas;
		String nomAlum;
	
		Scanner dato = new Scanner(System.in);
		ArrayList<String> listaAlum = new ArrayList<String>();
		HashMap<String, ArrayList<Double>> cursoHash = new HashMap<String, ArrayList<Double>>();
			/*Se debe crear una función que permita al profesor ingresar notas por estudiante y que
			luego permita obtener el promedio de cada estudiante. 
			La funcion promedio esta fuera del main y la llmaré en el main*/

		//Pido info al usuario de cuantos alumnos y notas va a ingresar y que notas son y los nombres

		/*Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
		alumnos por curso y que luego los muestre.*/
		
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

		for(int i = 1; i <= cantAlum; i++ ){
			dato.nextLine();
			ArrayList<Double> arregloNotas = new ArrayList<Double>();
			System.out.print("Ingrese nombre del Alumno: ");
			nomAlum = dato.nextLine();
			for(int x =1; x<= cantNotas; x++){
				System.out.print("ingresa la nota "+x+" del alumno "+nomAlum+": ");
				Double nota =dato.nextDouble();
				arregloNotas.add(nota);
			}
			cursoHash.put(nomAlum, arregloNotas);
		}
		//aqui muestra el curso, el nombre y las notas de cada alumno
		System.out.println("**************************muestra el curso*****************************");
		System.out.println(cursoHash);


		for (String i : cursoHash.keySet()){
			Double promAlum = promedioNotas(cursoHash.get(i));
			System.out.println("El promedio del alumno "+ i +" es de: " + promAlum);
			notas(cursoHash.get(i));
		}

		curso curso1 = new curso();
		curso1.setnomCurso("4to B");
		System.out.println(curso1);
		curso1.mensjCurso();
		System.out.println("\n");

		grado grado1 = new grado();
		grado1.setGrado(4);
		grado1.numGrado();  //no supe como sacar este null
		System.out.print(grado1);
		System.out.println("\n");

		materia arte = new materia();
		System.out.println(arte);
		arte.arte(true);

		

	}

	}



