package ThirtieFirst;
import java.util.Scanner;
public class Knapsack {
	public static long max(long l , long b){
		return l > b ? l : b ;
	}
	public static long knapsack(int W, int wt[] , long[] val , int n) {
		if(n==0 || W ==0) {
			return 0;
		}
		if(wt[n-1]>W) {
		return knapsack(W,wt,val,n-1);	
		}else {
			return max(val[n-1]+knapsack(W-wt[n-1],wt,val,n-1),knapsack(W,wt,val,n-1));
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt() , W = sc.nextInt();
	long val [] = new long [n];
	int wt [] = new int [n];
	for(int i=0;i<n;i++) {
	 wt[i]=sc.nextInt() ; val[i]=sc.nextLong();
	}
	System.out.println(knapsack(W,wt,val,n));
	}
}
