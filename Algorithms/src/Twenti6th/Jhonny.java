package Twenti6th;
import java.util.ArrayList;
import java.util.Scanner;
public class Jhonny {
	public static boolean fun(ArrayList<Integer> num , int x) {
        for(int j=0;j<num.size();j++) {
         if(!num.contains(num.get(j)^x)) {
        	return false;
         }
        }
        return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ne = new ArrayList<>();
		while(n --> 0) {
			ne.clear();
			int a = sc.nextInt();
			for(int i=0;i<a;i++) {
		    ne.add(sc.nextInt());
			}
			int x=0;
			for(int i=1;i<1025;i++) {
				if(fun(ne,i)){
					System.out.println(i);
					x=1;
					break;
				}
				}
			if(x!=1) {
				System.out.println(-1);
			}
		}
	}
}
