package Twenti7th;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class AgrCows {
	public static boolean f(long mid,long c, ArrayList<Long> barns) {
		long vacas =1;
		long lastpos = barns.get(0);
		for(int i=1;i<barns.size();i++) {
			if(barns.get(i)-lastpos>=mid) {
				vacas++;
				if(vacas==c) {
					return true;
				}
				lastpos=barns.get(i);
			}
		}
		return (vacas==c);
	}
	public static long binarysearch(long c,ArrayList<Long> barns) {
		long start=0;
		long end=barns.get(barns.size()-1)-barns.get(0);
		long mid=1;
		while(end-start>1) {
			mid=(start+end)/2;
			if(f(mid,c,barns)) {
				start=mid;
			}else {
				end=mid;
			}
		}
		if(f(start,c,barns)) {
			return start;
		}
		if(f(end,c,barns)) {
			return end;
		}
		return -1;
	}
	public static void main(String[] args) throws java.lang.Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long cases= Long.valueOf(br.readLine());
	while(cases>0) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N=Integer.valueOf(st.nextToken());
		long C= Integer.valueOf(st.nextToken());
		ArrayList<Long> barns=new ArrayList<>();
		for(int i=0;i<N;i++) {
			barns.add(Long.valueOf(br.readLine()));
		}
		Collections.sort(barns);
		System.out.println(binarysearch(C,barns));
		cases--;
	  }
  }
}
