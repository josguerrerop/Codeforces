package ThirtieFirst;
import java.util.Arrays;
import java.util.Scanner;
public class drink {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int c = sc.nextInt();
		while(c-->0) {
			int k = sc.nextInt();
			System.out.println(find(0,n,k,a));
		}
	}//this code was tested and debuged 
	static int find(int low,int high ,int key,int a[]) {
	while(low<high){
		int mid=(low+high)/2;
		if(a[mid]<=key) {
			low=mid+1;
		}
		else
			high=mid;
	}
		return low;
	}
}
