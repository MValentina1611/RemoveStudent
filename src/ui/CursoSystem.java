package ui;

import model.Curso;
import model.Estudiante;

public class CursoSystem {

	private static Curso curso01;
		
	
	public static void main(String[] args) 
	{
		curso01 = new Curso("APOII", 8);
		
		//To test:
		
		addEstudiantesSystem(new Estudiante("Julio", "A01"));
		//addEstudiantesSystem(new Estudiante("Valen", "A02"));
		//addEstudiantesSystem(new Estudiante("Valen", "A03"));
		//addEstudiantesSystem(new Estudiante("Valen", "A04"));
		//addEstudiantesSystem(new Estudiante("Daniel", "A05"));
		//addEstudiantesSystem(new Estudiante("Valen", "A06"));
		addEstudiantesSystem(new Estudiante("Andres", "A07"));
	
		System.out.println(curso01.pintarEstudiantes());
		
		System.out.println("-------------------------------------");
		System.out.println( "Deleted Students: "+curso01.eliminarEstudiantes("Julio"));
		System.out.println("-------------------------------------");
		
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
