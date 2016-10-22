package rabinkarp;

public class TempRK {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		System.out.println(calcmod(-10)); // srsly? negative?
	}

	public static long calcmod(int m){
		if (m <= 1){
			return 31;
		}
		else{
			return (((calcmod(m-1))%511)*31)%511;
		}
	}

}
