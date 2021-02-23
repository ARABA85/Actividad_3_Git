package ejer2.pojo;

public class Motor {
	
	private int id;
	private String tipoMotor;
	private String potencia;
	private int duracion;
	
	
	public Motor(int id, String tipoMotor, String potencia,int duracion) {
		
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
		this.duracion =duracion;
	}


	public int getDuracion() {
		return duracion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}


	public String getPotencia() {
		return potencia;
	}


	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
	
	
	

}
