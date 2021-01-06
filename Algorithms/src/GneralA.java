
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GneralA {

	private static void MinimunSecond(int n, int[] numeros) {
		 int max=-9999;
		 int min=9999;
		 int posicion1=0;
		 int posicion2=0;
		 
		 for(int i=0; i<n; i++) {
		  
			 if(numeros[i]<=min) {
				  min=numeros[i];
				  posicion2=i;
		  }
			 
			 if(numeros[i]>max) {
					max=numeros[i];
					posicion1=i;
					}
		 }
		 if(posicion1>posicion2) {
			 posicion2++;}
		  System.out.print(((posicion1-0)+(n-posicion2-1)));;
	  }
	public static void main(String[] args){
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int [] numeros = new int [n];
		
		for(int i=0;i<n;i++) {
			numeros[i] = Integer.parseInt(st.nextToken());
		}
		MinimunSecond(n, numeros);
		}catch(Exception e) {
			
		}
	}
}