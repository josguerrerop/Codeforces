import java.io.*;

class NewtonRapson {
public static void main(String[] args) {

	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String linea;
	
	while((linea = br.readLine())!=null) {
		long n = Integer.parseInt(linea);
		System.out.println(cambio(n));
	}
	br.close();
	
	}catch(Exception e) {
		e.getStackTrace();
	}
 
 }

private static long cambio(long n) {
	if(n/2 +n/3 + n/4 > n) {
		
		return cambio(n/2) + cambio(n/3) + cambio(n/4); 
	}else {
		
	return n;}
}

}
