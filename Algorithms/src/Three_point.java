import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Three_point{
        public static boolean arr(ArrayList<Integer> arr){
            for(int i=0;i<arr.size()-1;i++){
             for(int j=i+1;j<arr.size();j++){
            if(arr.get(i)==arr.get(j)){
            return true;
            }
            }
          }
            return false;
        }
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//br.readLine();
			boolean x = true;
                        int cases=1;
			while(x) {///     
	       String P="";
		if((P = (br.readLine()))!=null) {
			int p = Integer.parseInt(P);
                        String[] nombre = new String[p];
                        ArrayList<String> d = new ArrayList<>();//array to show names and score
                        ArrayList<Integer> dif = new ArrayList<>();//array to add each player score and compare if all are the same
                        String player="";
                        String c="";
			for(int i=0;i<p;i++) {
                               int count =0;
                               int index =0;
                            player= br.readLine();
                          for(int j=0;j<player.length();j++){///
                          if(player.charAt(j)=='1'){
                          count++;
                           }
                          }
                          index = player.indexOf(';');
                          c=player.substring(index+1,player.length());
                          
                          for(int j=3;j<c.length();j=j+5) {
                 	    	 if(c.charAt(j)=='1') {
                 	    		 count++;
                 	    	 }
                 	     }
                            player = player.substring(0,index);
                            d.add(player+" "+count);
                             dif.add(count);
                             }
                      System.out.println("Case "+cases+":");
                       if(!arr(dif)){//arr is the function to veryfy if all player's score is the same
                       Collections.reverse(d);
                          for(int i=0;i<d.size();i++){
                          System.out.println(d.get(i));
                        }
                       }else{
                        Collections.sort(d);
                       for(int i=0;i<d.size();i++){
                    	   System.out.println(d.get(i));
                        }
                       }
                        cases++;
		}   else
		x=false;    
	                  }
		      } catch (NumberFormatException | IOException e) {
		}
	}
}









