import java.util.*;

class Mother{
	static HashMap<Integer,Integer> memo = new HashMap<>();
	
	int fibonacci(int n){
		if (memo.containsKey(n)){
			System.out.println("From Cache"+n);
			return memo.get(n);
		}
		else{
			memo.put(n,(fibonacci(n-1)+fibonacci(n-2)));
			return memo.get(n);
		}
	}
}

public class primeorigin extends Mother{
		
	public static void main (String[] args) {
		memo.put(0,0);
		memo.put(1,1);
		primeorigin myobj = new primeorigin();
		Mother newobj = new Mother();
		for(int i = 0; i<10000; i++)
		System.out.println(myobj.fibonacci(i));
	}
}

