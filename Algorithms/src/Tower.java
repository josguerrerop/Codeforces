import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tower {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t =sc.nextInt();
	Set<Integer> set = new HashSet<Integer>();
	
	while(t-->0) {
		set.clear();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		 set.add(sc.nextInt());
		 if(n==1 && set.contains(0)) {
			System.out.println(0);
		 }else if(n==1 && set.contains(1))
		 {
			 System.out.println(1);
		 }
		 if(n>1 && set.contains(1)) {
			 System.out.println(2);
		 }
		 else
		 System.out.println(set.size());
	}
  }
}
