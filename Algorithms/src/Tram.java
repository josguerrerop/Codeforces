import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Tram {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
		    int n = Integer.parseInt(st.nextToken());
		    int q= Integer.parseInt(st.nextToken());
		    if(q>0) {
		    	ArrayList<Long> deque = new ArrayList<Long>();
		    	st = new StringTokenizer(br.readLine());
		    	long max = 0;
		    	for(int i=0;i<n;i++) {
		    		Long x = Long.parseLong(st.nextToken());
		    		deque.add(x);
		    		if(x>max) {
		    			max =x;
		    		}
		    	}
		    	ArrayList<long[]> pareja = new ArrayList<long[]>();
		    	long a,b;
		    	while(deque.get(0)<max) {
		    		if((a=deque.get(0).longValue())< (b=deque.get(1).longValue())){
		    			deque.add(deque.remove(0));
		    		}else {
		    			deque.add(deque.remove(1));
		    		}
		    		long p[]  = {a,b};
		    		pareja.add(p);
		    	}
		    	for(int i=0; i<q;i++) {
		    		long pos = Long.parseLong(br.readLine());
		    		if(pos<= pareja.size()) {
		    			long[] p = pareja.get((int) pos-1);
		    			System.out.println(p[0]+" "+p[1]);
		    		}else {
		    			int pos2 = (int)(pos%(deque.size()-1))-pareja.size();
		    			if(pos2<=0) {
		    				pos2+=deque.size()-1;
		    				if(pos2==0) {
		    					pos2=deque.size()-1;
		    				}
		    			}
		    			System.out.println(deque.get(0)+" "+deque.get(pos2));
		    		}
		    	}
		    }
		    br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
