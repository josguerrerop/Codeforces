import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Parentesis {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n;i++) {
				int j;
				Stack<Character> Stack = new Stack<Character>();
				String parentesis = br.readLine();
				int len = parentesis.length();
				System.out.print(len);
				if(len==0) {
					System.out.print("Yes");
					continue;
				}
				for( j=0;j<len;j++) {
					if(parentesis.charAt(j)=='(' || parentesis.charAt(j)=='['){ 
						Stack.push(parentesis.charAt(j));}
					else if(!Stack.empty() && (Stack.peek()=='(') &&(parentesis.charAt(j)==')')||(Stack.peek().equals('[')) && (parentesis.charAt(j)==']')) {
					Stack.pop();
					}
					else if (parentesis.charAt(j)==' ') {
						continue;}
					else {
						break;
					}
				}
				if(Stack.empty()&& len==j)
					System.out.print("Yes");
				else
					System.out.print("No");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}