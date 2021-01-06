package Twenti6th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Fedor {
public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    String [] a = new String[m+1];
    
    for(int i=0; i<m+1; i++){
    a[i] = String.format("%8s", Integer.toBinaryString(Integer.parseInt(br.readLine()))).replace(' ', '0');
    }
    int count =0; 
    
    for(int i=0; i<a.length-1; i++){
        int c=0;
        
        for(int j=a[i].length()-1 , o = 0; j>=0 && c<=k; j--,o++){
            if(a[m].charAt(a[m].length()-1-o)!=a[i].charAt(j))
            c++;
        }
        
        if(c<=k) count++;
        
    }
    
    System.out.println(count);
   
    
}
}