package parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class equation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int  n = Integer.parseInt(br.readLine());
	 int one=0;
	boolean b=true;
	 while(n-->0) {
		if(n%5==0) {
			n=(n/5)*4;
		}else if(n%3==0) {
			n=(n/3)*2;
		}else if(n%2==0) {
			n=n/2;
		}else {

			b=false;
			break;
		}
		 one++;
		if(b) {
			System.out.println(one);
		}
	 }
	 
	}
}
