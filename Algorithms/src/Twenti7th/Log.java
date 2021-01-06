package Twenti7th;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Log {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
  while(t-->0) {
	 long n=sc.nextLong(),k=sc.nextLong(),m=sc.nextLong();
	  solve(n,k,m);
  }
	}
	public static void solve(long n,long k ,long m) {
		if(m<n) {
			System.out.println(0);
		}else {
			double tmp= Math.log(m/n)/ Math.log(k);
			long x = (long) Math.floor(tmp);
			System.out.println(x);
			}
	}
}
		
