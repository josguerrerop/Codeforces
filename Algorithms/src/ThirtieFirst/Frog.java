package ThirtieFirst;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Frog {
	public static void main(String[] args) {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     ArrayList<Integer> arr = new  ArrayList<>();
		try {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int sum=0;
		for(int i=0;i<N-2;i++) {
			if(arr.get(i)<arr.get(i+1)) {
				sum+=Math.abs(arr.get(i)-arr.get(i+1));
			}else {
				sum+=Math.abs(arr.get(i)-arr.get(i+2));
			}
		}
		
		System.out.println(sum);
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
