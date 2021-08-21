import java.util.*;

public class Try {
	
	static HashMap<Integer,Integer>memo = new HashMap<>();
	
	int fibo(int n){
		if (memo.containsKey(n)==true){
			return memo.get(n);
		}
		else{
			memo.put(n,fibo(n-1)+fibo(n-2));
			return memo.get(n);
		}
	}
	
	
	public static void main (String[] args) {
		memo.put(0,0);
		memo.put(1,1);
		Try hello = new Try();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //{Print the nth fibonacci number
		for(int i=1;i<n+1;i++){
			if (i==n)
			System.out.println("The Fibonacci of "+i+" is : "+hello.fibo(i));
		}
	}
}






