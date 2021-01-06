package Twenti7th;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class common {
	static Scanner sc = new Scanner(System.in);
	static Set<Integer> set = new HashSet<Integer>();
	static int res ;
	public static void main(String[] args) {
	int c = sc.nextInt();
	while(c -->0) {
		set.clear();
		boolean bol = false;
		res=0;
		int a=sc.nextInt() , b=sc.nextInt();
		for(int i=0;i<a;i++) {
			set.add(sc.nextInt());
		}
		bol = eval(b);
		if(bol) {
			System.out.println("YES");
			System.out.println(1+" "+res);
		}else {
			System.out.println("NO");}
	}
	}
	public static boolean eval(int m) {
	boolean bol = false;	
		for(int i=0;i<m;i++) {
			 int x = sc.nextInt();
			if(set.contains(x)) {
				 res=x;
           bol= true;
			}
		}
		return bol;
	}
}
