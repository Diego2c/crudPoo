
import java.util.ArrayList;
import java.io.IOException;


public class ManejadorUsuario {

	private ArrayList <Usuario> listaUsuario;
	private int idUsuario = 2018000;
	private static ManejadorUsuario instancia;
	
	public ManejadorUsuario() {
		listaUsuario = new ArrayList<Usuario>();
	}
	
	public static ManejadorUsuario getInstancia() {
		if (instancia == null) {
			instancia = new ManejadorUsuario();
		}
		return instancia;
	}
	
	public void setListaUsuario(Usuario usuario) {
		this.listaUsuario.add(usuario);	
		System.out.println("	¡Agregado !	");
		System.out.println(" ");
	}
	
	public  ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}
 
	public void AgregarUsuario( String nombreUsuario,String sexo,int edad)  {
		Usuario usuario= new Usuario();
		idUsuario = idUsuario + 1; 
		usuario.setIdUsuario(idUsuario);
		usuario.setNickName(nombreUsuario);
		usuario.setSexo(sexo);
		usuario.setEdad(edad);
		setListaUsuario(usuario);
	}
	
	public void MostrarUsuarios() {
		System.out.println("|_______  -----    Usuarios     -----  _______ ");
		for (Usuario cont: listaUsuario) {
			System.out.println("	| ID      : " + cont.getIdUsuario() );
			System.out.println("	| Usuario : " + cont.getNickName());
			System.out.println("	| Sexo	  : " + cont.getSexo());
			System.out.println("	| Edad	  : " + cont.getEdad());
			System.out.println("----------------------------------- ");
			try { Thread.sleep (1000); 
		   } catch (Exception e) { };
		}
		System.out.println(" ");
	}
	
	public void ModificarUsuario(int id, String nuevo)  {
		System.out.println(" ");
		for(Usuario cont: listaUsuario) {
			if(cont.getIdUsuario() == id ){
				System.out.println(" ");
				System.out.println("|______  -----    MODIFICADO !     -----  ______ ");
				System.out.println(" ");
				cont.setNickName(nuevo);
				break;
			}
		} 
	}	
	
	public void EliminarUsuario(int id) {
		for(Usuario poss: listaUsuario){
			if(poss.getIdUsuario() == id ){
				listaUsuario.remove(poss);
				System.out.println("|______  -----    ELIMINADO !     -----  ______ ");
				System.out.println(" ");	
				break;
			}
		}
	}
		
}