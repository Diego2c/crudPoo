public class Usuario extends Persona {
	
	private int idUsuario;
	private String nickName;
	
	public Usuario() {
	
	}
	
	public Usuario(String sexo,int edad,int idUsuario, String nickName){
		super(sexo,edad);
		this.idUsuario = idUsuario;
		this.nickName = nickName;
	}		

	public void setNickName(String nickName) {	
		this.nickName = nickName;
	}
	public String getNickName() {
		return nickName;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario=idUsuario;
	}
	public int getIdUsuario() {	
		return idUsuario;
	}
	
}
