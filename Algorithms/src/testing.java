



public class testing {

	public static void main(String[] args) {
		
		
		String line = "Michael Jordan;0 1 1 0 1;0 1 1 0 1;0 1 1 0 1;0 0 0 0 1;0 0 0 0 1";
		String name ="";
		int mark=0;
		
		String[] data = line.split(";");
		name = data[0];
		for (int i = 1; i < 6; i++) {
			data[i] = data[i].trim();
			mark += data[i].charAt(0) + data[i].charAt(2) + data[i].charAt(4) + data[i].charAt(6)
					+ 2 * data[i].charAt(8) - 6 * '0';
		}
		
		int n ='0';
		
		System.out.print(n);
		
	}

}
