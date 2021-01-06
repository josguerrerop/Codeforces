import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Domino {

	public static void main(String[] args) {

		
		try {
			
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String [] mn = br.readLine().split(" ");
	    
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
      
      int r = (m*n)/2;
      
      System.out.print(r);
        
        
		}catch(Exception e)
		
		{e.getStackTrace();}
		
		
	}

}
