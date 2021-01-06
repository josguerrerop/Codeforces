package Twenti7th;

import java.util.Scanner;
public class trial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr [] = {100,20,10,5,1};
	int n= sc.nextInt();
     int sum=0;
    	 for(int i=0;i<=4;i++) {
    		if(n>=arr[i]) {
    			sum+=n/arr[i];
    			if(n%arr[i]==0) {
    				break;
    			}else
    			{
    				n-=((n/arr[i])*arr[i]);
    			}
    		}
    	 }
    	 System.out.println(sum);
    }
}
