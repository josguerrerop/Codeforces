import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Inflation {

	public static void main(String[] args) {
try {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	  int globos = Integer.parseInt(st.nextToken());
	   int[] capacidades = new int[globos];
	     st = new StringTokenizer(br.readLine());
	      double menor =1;

	 for(int i=0;i<globos;i++){capacidades[i]= Integer.parseInt(st.nextToken());}
	 
	 Arrays.sort(capacidades);
	 menor =inflar(capacidades);
	 if(menor==-1) {System.out.print("impossible");}
	 
	 else if(menor==0.0) {System.out.print(0);}
	 else {
		 String res = String.valueOf(menor);
		 if(res.length()>8) {res = res.substring(0,8);}
		 System.out.print(res); }
 br.close();
	
}catch(Exception e) {e.getStackTrace();}
	}
	
	private static double inflar(int [] capacidades) {
	double menor=1.0;
	for(int i=0;i<capacidades.length;i++) {
		if(capacidades[i]>(i+1)) {
			return -1;
		}else {
			double valor =(double) capacidades[i]/ (double) (i+1);
			 if(valor<menor) {
				 menor=valor;
			}
		}
	 }
	return menor;
  }
}
