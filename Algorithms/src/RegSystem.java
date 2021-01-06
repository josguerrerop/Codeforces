import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class RegSystem {
	public static void main(String[] args) {
		Map<String,Integer>  Map = new HashMap<String,Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String linea = "";
			ArrayList<String> f= new ArrayList<>();
			if((linea = br.readLine())!=null) {
				int n = Integer.parseInt(linea);
				for(int i=0;i<n;i++) {
					String str = br.readLine();
					if(!Map.containsKey(str)) {
						Map.put(str, i);
						System.out.println("OK");
					}else {
						f.add(str);
						int x =Collections.frequency(f,str);
						System.out.println(str+x);
					}	
				}
			}
	      } catch (IOException e) {
			e.printStackTrace();
		}
	}
}
