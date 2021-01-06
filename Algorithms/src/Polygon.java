import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polygon {



	public static void main(String[] args) throws IOException {
		
	 try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int casos = Integer.parseInt(br.readLine());
			while(casos-->0) {
				int tan = Integer.parseInt(br.readLine());
				char datos[][] = new char[tan][tan];
				for(int i=0; i<tan;i++) {
					datos[i]= br.readLine().toCharArray();
				}
				System.out.print(evaluate(datos)? "YES" : "NO");
			}
		}catch(Exception e) {e.getStackTrace();}
		
}
	private static boolean evaluate(char[][] datos){
		for(int i=0;i<datos.length-1;i++) {
			for(int j=0;j<datos.length-1;j++) {
				if(datos[i][j]=='1') {
					if(datos[i+1][j]=='0' && datos[i][j+1]=='0') {
						return false;
					}
				}
			}
		}
		return true;
	}
}
