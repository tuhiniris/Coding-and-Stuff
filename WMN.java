import java.util.*;
import java.math.BigInteger;

public class WMN {
	
	static HashMap<BigInteger,BigInteger> memo = new HashMap<>();	
	
	BigInteger fibo(BigInteger n){
		
		if((n==BigInteger("1"))||(n==BigInteger("0"))){
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
		
		BigInteger n = 90588;
		for(BigInteger i=1;i<n+1;i++){
			wip.fibo(i);
			if (i==n){
				System.out.println(wip.fibo(n));
			}
		}
	}
}

