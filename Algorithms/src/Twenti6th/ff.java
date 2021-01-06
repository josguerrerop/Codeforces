package Twenti6th;


public class ff {
	public static int count(int n) {
		int c=0;
		while(n!=0) {
			n=n&n-1;
			System.out.println(n);
			c++;
		}
		return c;
	}

public static void main(String[] args) {
	
	
  }

}