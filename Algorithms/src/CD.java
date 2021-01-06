import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class CD {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str= ""; 
			String s="";
			int a,b,n;
			 int count=0;
			while((str=br.readLine())!=null || (s!="0 0") ) {
				String[] num = str.split(" ");
		    	  a = Integer.parseInt(num[0]);
		    	  b = Integer.parseInt(num[1]);
		    	  n=a+b;
		     ArrayList<String> arr = new ArrayList<>();
				for(int i=0;i<n;i++) {
					if(!arr.contains(str=br.readLine())) {
						arr.add(str);
					}else {
						count++;}
				}
				System.out.println(count);
				s = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
