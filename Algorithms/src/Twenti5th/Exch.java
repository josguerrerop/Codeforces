package Twenti5th;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
//https://codeleading.com/article/56852429675/
public class Exch {
	public static void main(String[] args) {
		LinkedList<Integer> one = new LinkedList<>();
		LinkedList<Integer> two = new LinkedList<>();
		try {
			Scanner in = new Scanner(System.in);
			 long n = in.nextInt();
			while(n!=0)
			 {
				 one.clear();
				 two.clear();
				for(int i =0;i<n;i++)
				 {
					 one.add(in.nextInt());
					 two.add(in.nextInt());
				 }
				 Collections.sort(one);
				 Collections.sort(two);
				 if(one.equals(two)) {         
					 System.out.println("YES");
				 }else {
					 System.out.println("NO");
				 }
					 		n = in.nextInt();
			 }
		}catch(Exception e) {
			e.getStackTrace();
		}	
	}
}
