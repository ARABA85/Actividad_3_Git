package ejer2.pojo;

public class Coche {

	
	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	private double precio;

	private int kilometros;

	Motor potencia;

	
	
	
	public Coche(int id, String matricula, String modelo, String marca,int kilometros,double precio) {
	
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.kilometros = kilometros;
		this.precio= precio;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getKilometros() {
		
	
		return kilometros;
		
	}

	// los setter y getter de potencia de la clase motor

	public Motor getPotencia() {
		return potencia;

	}




	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public void setPotencia(Motor potencia) {
		this.potencia = potencia;
	}
	
	

	
	
	
	
	
	
}
