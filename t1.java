import java.util.*;
public class t1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++){
			arr.add(sc.nextInt());
		}
		
		
		
		
		for(int i=0;i<N;i++){			
			System.out.print((arr.get(i)+" "));		
		}
	}
}

