package parcial2;
import java.util.Scanner;
public class tram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] hm = new int[N];
		int[] gt = new int[N];
		for(int i = 0; i<N; i++){
			hm[i] = sc.nextInt();
			gt[i] = sc.nextInt();
		}
		int sum= 0;
		for(int i = 0; i<N; i++){
			for(int j = 0; j<N; j++){
				if(hm[i] == gt[j]) {
					sum++;
					}
			}
		}
		System.out.println(sum);

	}
}
