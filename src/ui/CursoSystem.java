package ui;

import model.Curso;
import model.Estudiante;

public class CursoSystem {

	private static Curso curso01;
		
	
	public static void main(String[] args) 
	{
		curso01 = new Curso("APOII", 5);
		
		addEstudiantesSystem(new Estudiante("Valen", "A01"));
		addEstudiantesSystem(new Estudiante("Juan", "A02"));
		addEstudiantesSystem(new Estudiante("Carlos", "A03"));
		addEstudiantesSystem(new Estudiante("Andres", "A04"));
		addEstudiantesSystem(new Estudiante("Luisa", "A05"));
		addEstudiantesSystem(new Estudiante("Julio", "A06"));
		
		System.out.println(curso01.size());
	
		System.out.println(curso01.pintarEstudiantes());
	}
	
	public static void addEstudiantesSystem(Estudiante newEstudiante)
	{
		if( curso01.size() < curso01.getNumEstudiantes())
		{
			curso01.addEstudiantes(newEstudiante);
		}
		else
		{
			System.out.println("The course is full");
		}
	}
	

}
