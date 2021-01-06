import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LittleE {

	public static void main(String[] args) {

		try {
			boolean result = true;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
			for(int i=0;i<8;i++) {
				
				String letra = br.readLine();
				
		
				
				for(int j=1;j<letra.length();j++) {
					if(letra.charAt(j)==letra.charAt(j-1)) {
						System.out.print(letra.charAt(j) +"j\n");
						System.out.print(letra.charAt(j) +"j-1\n");
						result = false;
						
					}
					
				}
				
			}
			
			System.out.print(result ? "YES" : "NO");
			
		}catch(Exception e) {e.getStackTrace();}
		
		
		
		
	}

}
