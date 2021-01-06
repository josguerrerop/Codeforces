package Thirteenth;
import java.util.Scanner;
public class QueriesAbout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int sum =0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt() , b= sc.nextInt(), c= sc.nextInt();
			if(a+b+c>=2)
				 sum++;
		}
		System.out.println(sum);
		
		}
	}

