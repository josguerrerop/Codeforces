import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximuGDC {

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			while(t--> 0) {

				int n = Integer.parseInt(br.readLine());
				
				if(n%2!=0) {
				System.out.println((n-1)/2);
				}else
					System.out.println(n/2);	
				
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
