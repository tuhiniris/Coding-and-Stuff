import java.util.*;
public class VipraV {
	
	static Hashtable<Long,Long>memo = new Hashtable<>();
	
	long fibonacci(long n){
		if (n==0 || n==1){
			return n;
		}
		else if(memo.containsKey(n)){
			
			return memo.get(n);
		}
		else{
			 
			memo.put(n, fibonacci(n-1)+fibonacci(n-2));
			return memo.get(n);
		}
	}
	
	public static void main (String[] args) {
		VipraV hello = new VipraV();
		System.out.println(hello.fibonacci(1000));

		System.out.println(memo);
	}
}

