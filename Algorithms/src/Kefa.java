import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Kefa {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int cnt =1;
		int max=Integer.MIN_VALUE;
		try {
			n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<arr.length;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]<=arr[i+1]) {
					cnt++;
				}else {
					cnt=1;
				}
				if(cnt>max) {
					max=cnt;
				}
			}
			System.out.println(max > 0 ? max : 1);	
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} 
	}
}