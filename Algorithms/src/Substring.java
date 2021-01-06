import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Substring {
 public static void main(String args[]) {
	 try {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int casos = Integer.parseInt(br.readLine());
		 while(casos-->0) {
			 char caracteres[]=br.readLine().toCharArray();
			 for(int i=0; i< caracteres.length; i+=2) {
				 System.out.print(caracteres[i]);
			 }
		 }
		 
	 }catch(Exception e){e.getStackTrace();}
 }
}
