package Twenti6th;

import java.util.Scanner;

public class bacteria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =0;
		while(x>0) {
				s+=x%2;
				x/=2;
		}
System.out.println(s);
		/*
		
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	
	if(x%2==0)
		 x=1;
	else
		 x= x%2+1;
		
	System.out.println(x);
	*/
	
	}
	

}
