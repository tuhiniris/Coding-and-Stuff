import java.util.*;
import java.lang.Math;

public class t2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int R1 = sc.nextInt(); //30
		int N = sc.nextInt(); //5
		int R2 = sc.nextInt(); //35
		int X = sc.nextInt(); //500
		
		int total_travelling_hr = (int)Math.ceil((double)X/60);
		int rupees_first = R1*N;
		int rupees_last;
		if(total_travelling_hr>N){
			rupees_first = R1*N;
			rupees_last = R2*(total_travelling_hr - N);
		}
		else{
			rupees_first = total_travelling_hr*R1;
			rupees_last = 0;
		}		
		System.out.println(rupees_first+rupees_last);		
	}
}

