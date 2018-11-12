import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada {
	
	public String ingreso() {
		String lectura = null;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try  {
			lectura = br.readLine()	;
		} catch (IOException ioe) {
			System.out.println(" error ");
		}
		
		return lectura;
		
	}
	
}