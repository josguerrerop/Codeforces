import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElephantAndBits {

	public static void main(String [] args) {
		/*
		try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String valor =br.readLine();
	int posCero = valor.indexOf('0');
	 if(posCero ==-1) {
		 System.out.println(valor.substring(1));
	 }else {
		 System.out.println(0);
	 }
			
		}catch(Exception e) {
			e.getStackTrace();}
		*/
		String a = "abbaac";
		String b = "";
		for(int i=0; i<a.length();i++) {
	while(!a.equals(null)) {
		if(a.charAt(i+2)==a.charAt(i+1)) {
			b+=a;
			System.out.print(b);

		}
	
		
	}
		}
		
	}
	
	
}
