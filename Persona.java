
public class Persona  {
	
	private String sexo;
	private int edad;

	public Persona() {
	
	}
	
	public Persona(String sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}		
	public String getSexo(){
		return sexo;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}
	public int getEdad(){
		return edad;
	}
		
}
