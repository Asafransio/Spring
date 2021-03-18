package es.studium;


public class Alumno {
	
	//constructor
	private String nombre;
	private String direccion;
	private String asignatura;
	private float nota;
	private Centro centro;
	
	//inicializar
	public Alumno() {
		nombre="";
		direccion="";
		asignatura="";
		nota=0;
		setCentro(new Centro());
	}
	
	
	//getters & setters	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//-------------------------------------------------------
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//-------------------------------------------------------
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	//-------------------------------------------------------
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}


	public Centro getCentro() {
		return centro;
	}


	public void setCentro(Centro centro) {
		this.centro = centro;
	}

}