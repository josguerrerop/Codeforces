package Twenti5th;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MainR {
	
	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		Map<String,Integer> User = new HashMap<>();
    		while(n --> 0) {
    			String register = sc.next();
    			if(User.containsKey(register)) {
    				System.out.println(register+""+User.get(register));
    			User.put(register, User.get(register)+1);
    			}else {
    				User.put(register,1);
    				System.out.println("OK");
    			}
  
    		}
    		
	}
}
