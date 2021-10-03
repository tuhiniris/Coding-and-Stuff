import java.util.*;
public class XM {
	static HashMap<Integer,Integer> memo = new HashMap<>();
	int fibo(int n){
		if(memo.containsKey(n)){
			return memo.get(n);
		}
		else{
			memo.put(n,(fibo(n-1)+fibo(n-2)));
			return memo.get(n);
		}
	}
	
	public static void main (String[] args) {
		memo.put(0,0);
		memo.put(1,1);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		XM test = new XM();
		System.out.println(test.fibo(n));
		
	}
}

