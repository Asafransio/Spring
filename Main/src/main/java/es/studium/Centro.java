package es.studium;

public class Centro {
	
	//constructor

	private String nombreCentro;
	private String direccionCentro;
	
	//inicializar
	
	Centro(){
		nombreCentro="";
		direccionCentro="";
	}
	
	//getters & setters
	
	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	//-------------------------------------------------------
	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}
	//-------------------------------------------------------
	
}