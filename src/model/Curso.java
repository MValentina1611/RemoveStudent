package model;

public class Curso {

	private String nombre;
	
	private int numEstudiantes;
	
	private Estudiante primerEstudiante, ultimoEstudiante;
	
	public Curso(String nombre, int numEstudiantes)
	{
		this.nombre = nombre;
		this.numEstudiantes = numEstudiantes;
	}
	
	//-------------------Methods-----------------------------

	public void addEstudiantes(Estudiante newEstudiante)
	{
		if(primerEstudiante == null)//Empty List
		{
			primerEstudiante = newEstudiante;
			ultimoEstudiante = primerEstudiante;
		}
		else//The List has one element, at least 
		{
			if(primerEstudiante == ultimoEstudiante)
			{
				primerEstudiante.setSiguiente(newEstudiante);
				newEstudiante.setAnterior(primerEstudiante);
				ultimoEstudiante = newEstudiante;
			}
			else//The List has more than one element
			{
				newEstudiante.setAnterior(ultimoEstudiante);
				ultimoEstudiante.setSiguiente(newEstudiante);
				ultimoEstudiante = newEstudiante;
			}
		}
	}
	
	public String pintarEstudiantes()//Returns String cause we cant't print info from model package
	{
		String info = "";
		Estudiante toPrint = primerEstudiante;
		do {
			
			info += toPrint.toString() + "\n\n";
			toPrint = toPrint.getSiguiente();
			
		}while(toPrint != null);
		
		return info;
		
	}
	
	public int size()
	{
		int size = 0;
		
		if( primerEstudiante != null)
		{
			Estudiante current = primerEstudiante;
			while( current != null )
			{
				size++;
				current = current.getSiguiente();
			}
		}
		return size;
	}
	
	//-------------------Getters && Setters-------------------
	public String getNombre() {
		return nombre;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public Estudiante getPrimerEstudiante() {
		return primerEstudiante;
	}

	public Estudiante getUltimoEstudiante() {
		return ultimoEstudiante;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}

	public void setPrimerEstudiante(Estudiante primerEstudiante) {
		this.primerEstudiante = primerEstudiante;
	}

	public void setUltimoEstudiante(Estudiante ultimoEstudiante) {
		this.ultimoEstudiante = ultimoEstudiante;
	}

	//--------------------------------------------------------
	


	
}
