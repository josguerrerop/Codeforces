import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hulk {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String h = "I hate that ";
		String l =" I love that ";
		String t =" I love it ";
		String it ="I hate it";
		try {
			int n = Integer.parseInt(br.readLine());
			int x=n;
			 if(n==1) {
				 System.out.print(h+" it");
			 }else
			
				 
				
				 
			for(int i=1; i<n;i++) {
			if(n%2==0)
					System.out.print(h+t);
			else 
				System.out.print(h+it);
			
			}
			
			
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
