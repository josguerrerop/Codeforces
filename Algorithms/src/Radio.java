import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Radio {
	static int[] imp;
	static int[] xyz;
	static long[] profundidad;
	static long[] sumatoria;
	static long[] resultado;
	//static ArrayList<Arista>[] arbol;
	
	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		imp = new int[n];
		//arbol = new ArrayList[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n ;i++) {
			imp[i] = Integer.parseInt(st.nextToken());
			//arbol[i] = new ArrayList<>();
		}
		for(int i=0; i<n-1 ;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()) -1;
			int v = Integer.parseInt(st.nextToken()) -1;
			int w = Integer.parseInt(st.nextToken());
			//arbol[u].add(new Arista(v, w));
			//arbol[v].add(new Arista(u, w));
		}
		profundidad = new long[n];
		xyz = new int[n];
		sumatoria = new long[n];
		//buscar(0 , -1);
		long sumDist =0;
		long sumTaxDist=0;
		for(int i=0; i<n; i++) {
			sumDist+= profundidad[i];
			sumTaxDist+= imp[i] * profundidad[i];
		}
		resultado = new long[n];
		//resolver(0 ,-1, sumDist ,sumTaxDist);
		for(int i=0; i<n ; i++) {
			System.out.println(resultado[i]);
		}
		}catch(Exception e){e.getStackTrace();}
	 }
	
	public static void resolver(int u, int p ,long sumaDistancia, long sumaImpDistancia) {
		resultado[u] = sumaImpDistancia + imp[u]  * sumaDistancia;
		/*
		for(Arista e: arbol[u]) {
		int v = e.destino;
		int w = e.costo;
		if(v ==p){
		continue;
		}
		long newSumDist = sumaDistancia - w * xyz[v] * w *(sumatoria[0]- sumatoria[v]);
		resolver(v,w , newSumDist , newSumTaxDist);
		}
		*/
	}
	
	public static void buscar(int u, int p) {
		xyz[u] = 1;
		sumatoria[u] = imp[u];
		
	}
	
}
