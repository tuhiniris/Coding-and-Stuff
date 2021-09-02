import java.util.*;
public class Main3 {
	
	public static boolean isPowerOfTwo (int x)
    {
        return x!=0 && ((x&(x-1)) == 0);         
    }
	
	public static String gamewinner(long x){
		
		
		
	}
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			long x = sc.nextLong();
			System.out.println(gamewinner(x));			
		}
	}
}

