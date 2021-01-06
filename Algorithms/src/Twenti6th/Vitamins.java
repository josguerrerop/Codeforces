package Twenti6th;
import java.util.Scanner;
public class Vitamins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A,B,C,AB,AC,BC,ABC
        int[] help = new int[7];
        for (int i = 0; i < help.length; i++) {
            help[i] = 1000000;
        }
        StringBuilder sb = new StringBuilder(3000);
        int t = sc.nextInt();
        int[] arr = new int[t];
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
//          sc.next();
            str[i] = sc.nextLine().trim();
            int len = str[i].length();
            if(len == 1) {
                com1(str[i] , help , arr[i]);
            }else if(len == 2) {
                com2(str[i], help,arr[i]);
            }else {
                com3(str[i],help,arr[i]);
            }
            sb.append(str[i]);
        }
        if(sb.indexOf("A") == -1 || sb.indexOf("B") == -1 || sb.indexOf("C") == -1) {
            System.out.println(-1);
        }else {
            int sum1 = help[0]+help[1]+help[2];//A+B+C
            int sum2 = help[0] + help[5];//BC+A
            int sum3 = help[1] + help[4];//B+AC
            int sum4 = help[2] + help[3];//C+BA
            int sum5 = help[3] + help[4];//AB+AC
            int sum6 = help[4] + help[5];//AC+BC
            int sum7 = help[3] + help[5];//AB+BC
            int sum = help[6];//ABC
            int min = sum1 > sum2 ? sum2 : sum1;
            min = min > sum3 ? sum3 : min;
            min = min > sum4 ? sum4 : min;
            min = min > sum5 ? sum5 : min;
            min = min > sum6 ? sum6 : min;
            min = min > sum7 ? sum7 : min;
            min = min > sum ? sum : min;
            System.out.println(min);
        }
        sc.close();
    }
    private static void com1(String s, int[] help , int price) {
        if(s.equals("A")) {
            if(help[0] > price) help[0] = price;
        }else if(s.equals("B")) {
            if(help[1] > price) help[1] = price;
        }else {
            if(help[2] > price) help[2] = price;
        }
    }
    private static void com2(String s, int[] help , int price) {
        if(s.equals("AB") || s.equals("BA")) {
            if(help[3] > price) help[3] = price;
        }else if(s.equals("AC") || s.equals("CA")) {
            if(help[4] > price) help[4] = price;
        }else {
            if(help[5] > price) help[5] = price;
        }
    }
    private static void com3(String s, int[] help , int price) {
        if(help[6] > price) help[6] = price;
    }
}