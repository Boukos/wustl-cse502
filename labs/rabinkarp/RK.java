package rabinkarp;

public class RK {
	
	//
	// Be sure to look at the write up for this assignment
	//  so that you get full credit by satisfying all
	//  of its requirements
	//
	private int width;
	private int[] c;
	private int h;

	private int p31mmod511; // parameter 31^m mod 511

	/**
	 * Rabin-Karp string matching for a window of the specified size
	 * @param m size of the window
	 */
	public RK(int m) {
			width = m;
			p31mmod511 = calcmod(m);
			c = new int[m];
	}
	

	/**
	 * Compute the rolling hash for the previous m-1 characters with d appended.
	 * @param d the next character in the target string
	 * @return
	 */
	public int nextCh(char d) {
		
		h = ( h * 31 - ( ( p31mmod511 * (c[0] % 511) )%511 )  + d ) % 511;
		h = ( h + 511 ) % 511;
		
		for (int i = 0; i < width-1; i++) {
			c[i] = c[i+1];
		}
		c[width - 1] = d;
		
		return h;
	}

	public int calcmod(int m){
		
		if (m <= 1){
			return 31;
		}
		else{
			return (((calcmod(m-1))%511)*31)%511;
		}
		
		/*
		int temppmod = 31;
		for (int i=0;i<m-1;i++){
			temppmod = ((temppmod%511)*31)%511;
		}
		return temppmod;
		*/
	}
	
}