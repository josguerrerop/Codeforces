package Twenti5th;

import java.io.*;
import java.util.*;
public class Photographer{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String nd[]=bf.readLine().split(" ");
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);
		String ab[]=bf.readLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		Client arr[]=new Client[n];
		for (int i = 0 ;i < n ; ++i){
			String xy[]=bf.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			arr[i]=new Client(a*x+b*y, i+1);
		}
		Arrays.sort(arr);
		StringBuilder out = new StringBuilder();
		int ans=0 , j=0;
		while (j<n && d>=arr[j].totMB){
			++ans;
			d-=arr[j].totMB;
			out.append(arr[j].num+" ");
			++j;
		}
		System.out.println(ans);
		System.out.println(out);
	}
	static class Client implements Comparable<Client>{
		int totMB , num;
		public Client(int totalMBa , int numb){
			totMB=totalMBa;
			num=numb;
		}
		@Override
		public int compareTo(Client o) {
			return Integer.compare(totMB, o.totMB);
		}
	}
}