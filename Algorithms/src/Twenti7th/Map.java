package Twenti7th;

import java.util.Scanner;
//https://vjudge.net/status/#un=&OJId=UVA&probNum=957&res=0&language=JAVA&onlyFollowee=false
public class Map {
	static int[] nums;
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
		int p=s.nextInt();
		int n=s.nextInt();
		nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
		}
		int rperiod,rstart,rfinish;
		
		
	  }
	
     }	
	static int binarySearch(int p,int r,int value) {
		if(p>r)
			return r;
		int q=(p+r)/2;
		if(nums[q]==value) {
			int ret=q;
			for(int i=q+1;i<nums.length;i++) 
				if(nums[i]==value)
					ret++;
				return ret;
		}
		else if(nums[q]>value)
			return binarySearch(p,q-1,value);
		else
			return binarySearch(q+1,r,value);
		}
	
	}
