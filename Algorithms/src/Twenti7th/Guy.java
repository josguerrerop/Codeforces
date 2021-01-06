package Twenti7th;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class Guy {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	Set<Integer> st = new HashSet<>();
	boolean anw = true;
	int n = sc.nextInt() , p = sc.nextInt() ;
	for(int i=0;i<p;i++) {
	st.add(sc.nextInt());	
	}
	int k = sc.nextInt();
	for(int i=0;i<k;i++) {
		st.add(sc.nextInt());	
		}
	for(int i=1;i<=n;i++) {
		if(!st.contains(i)) {
			anw=false;
			break;
		}
	}
	System.out.println(anw ? "I become the guy." : "Oh, my keyboard!");
	}
}
//Integer.parseInt((new StringTokenizer(br.readLine()).nextToken()));