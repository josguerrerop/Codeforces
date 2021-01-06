package ThirtySecond;

import java.util.ArrayList;
import java.util.Scanner;
public class Permutation {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      while(t-->0) {
    	  int n = sc.nextInt();
    	  for(int i=0;i<n;i++) {
    		  arr.add(i+1);
    	  }
    	  for(int i=0;i<n-1;i++) {
    		  arr.set(i,arr.get(i+1));
    	  }
    	  arr.set(arr.size()-1,1);
    	  for(int i=0;i<n;i++) {
    		 System.out.print(arr.get(i)+" ");
    	  }
      }
	}
}
