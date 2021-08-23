import java.util.*;
public class WMN {
	
	static HashMap<Long,Long> memo = new HashMap<>();	
	
	long fibo(long n){
		
		if((n==1)||(n==0)){
			return n;
		}
		
		else if (memo.containsKey(n)){
			return (memo.get(n));
		}
		else{
			memo.put(n,fibo(n-1)+fibo(n-2));
			return (memo.get(n));
		}	
		
	}	
	
	public static void main (String[] args) {		
		WMN wip = new WMN();
		
		long n = 91;
		for(long i=1;i<n+1;i++){
			wip.fibo(i);
			if (i==n){
				System.out.println(wip.fibo(n));
			}
		}
	}
}

