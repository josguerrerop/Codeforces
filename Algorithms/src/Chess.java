import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
	
	public static void main(String[] args) throws IOException {
		

		try{
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    String [] linea = br.readLine().split(" ");
			    int [] num = new int[11] ;
			    int [] num2 = new int[11] ;
			    		
				
				
				int x=0;
				
				
				for(int i=0; i<Integer.parseInt(linea[0]);i++) {
				String line= br.readLine();	
				
				for(int j=0 ;j<Integer.parseInt(linea[1]);j++) {
					
					if(line.charAt(j)=='S') {
						num[i]=1;
						num2[j]=1;
					}
					
				}
				
				}
				
				for(int i=0; i<Integer.parseInt(linea[0]);i++) {
					for(int j=0 ;j<Integer.parseInt(linea[1]);j++) {
						
						if(num[i]==0 || num2[j]==0) {
							x++;
						}
						
					}
					
					}

				System.out.print(x);

		}catch(Exception e) {e.getStackTrace();}
	}
	
}