package model;

public class Estudiante {
	
	private String codigo, nombre;
 
	private Estudiante siguiente, anterior;

 	public Estudiante(String nombre, String codigo)
 	{
 		this.nombre = nombre;
 		this.codigo = codigo;
 	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Estudiante getSiguiente() {
		return siguiente;
	}

	public Estudiante getAnterior() {
		return anterior;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}

	public void setAnterior(Estudiante anterior) {
		this.anterior = anterior;
	}
 	
	public String toString()
	{
		return "NOMBRE: "+nombre+"\nCODIGO: "+codigo;
		
	}

}
