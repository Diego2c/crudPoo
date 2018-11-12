

import java.io.IOException;


public class Menu {

	public String opcion = " ";
	Entrada lectura = new Entrada();
	private String cmd = "";
	private String cmd1 = "";
	ManejadorUsuario manejador = new ManejadorUsuario();
	
	public void menu() {
		
		System.out.println("|						|");
		System.out.println("|		M	E  N	 U    		| ");
		System.out.println("|	1---	Agregar 	    ---1	|");
		System.out.println("|	2---	Modificar	 	---2	|");
		System.out.println("|	3---	Listar   		---3	|");
		System.out.println("|	4---	Eliminar   		---4	|");
		System.out.println("|		salir				|");
		System.out.println("| ingrese alguno des estos comandos		|");
	}
	
	public void Inicio()  {
		
		do {
				menu();
				System.out.print(" : >");
				opcion= lectura.ingreso();
				
				switch ( opcion ) { 	
					case "1" :
						addUser();
						break;
					case "2"  :
						updateUser();
						break;
					case "3" :
						listUser();
						break ;
					case "4":
						deleteUser();
					default:
						if ( opcion.equals("salir")  ) {
							break;
						}
						System.out.println(" --- --- --- ---el comado : " + opcion + "_ no se reconose--- --- --- ---");
						break;
				}				 
			} while ( !opcion.equals("SALIR")  );	
	}
	
	
	public void addUser(){
		String nic,sexo;
		int edad;
		System.out.print("nombre  :>");
		nic = lectura.ingreso(); 
		System.out.print("sexo    :>");
		sexo = lectura.ingreso(); 
		System.out.print("edad    :>");
		try { 
			edad =Integer.parseInt(lectura.ingreso()) ; 
			manejador.getInstancia().AgregarUsuario(nic,sexo,edad);
		} catch (Exception e) {
			System.out.println( " ingreso una letra , se esparaba una numero ");
		};
		
	}
	
	public void updateUser(){		
		System.out.print("id  :>");
		cmd = lectura.ingreso(); 
		System.out.print("nombre  :>");
		cmd1 = lectura.ingreso(); 

		manejador.getInstancia().ModificarUsuario(Integer.parseInt(cmd),cmd1);
	}
	
	public void listUser(){
		manejador.getInstancia().MostrarUsuarios();
	}
	
	public void deleteUser(){
		System.out.println("| ingrese el id Del Usuario a eliminar");
		System.out.print("id  :>");
		cmd = lectura.ingreso(); 
		manejador.getInstancia().EliminarUsuario(Integer.parseInt(cmd));
	}
	

}