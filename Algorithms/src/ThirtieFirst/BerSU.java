package ThirtieFirst;
import java.util.Arrays;
import java.util.Scanner;
public class BerSU {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int n = sc.nextInt();
	int num[] = new int[n];
	
	for(int i=0;i<n;i++) {
		num[i]=sc.nextInt();
	}
	int m = sc.nextInt();
	int nm[] = new int[m];
	
	for(int i=0;i<m;i++) {
	nm[i]=sc.nextInt();
	}
	Arrays.sort(nm); Arrays.sort(num);
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(Math.abs(num[i]-nm[j])<2) {
				nm[j]=1000;
				sum++;
				break;
			}
		}
	}
	System.out.println(sum);
}
}
