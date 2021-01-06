package ThirtieFirst;

import java.util.ArrayList;
import java.util.Scanner;

public class lenght {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m=sc.nextInt(), s=sc.nextInt();
	 double sum=Math.pow(10, m);
	int sm=0;
	ArrayList<Integer> arr = new ArrayList<>();

	for(int i=0;i<sum;i++) {
    String nu = i+"";
    int su =0;
    for(int j=0;j<nu.length();j++) {
    			su+= nu.charAt(j)-'0';
    	if(su==s) {
    		arr.add(su);
    	}else
    	{
    		break;
    	}
    }
    
	}
	
	
	if(arr.size()>2) {
		System.out.println(arr.get(0)+" "+arr.get(1));
	}else
	{
		System.out.println(-1+" "+-1);
	}
	
}
}
