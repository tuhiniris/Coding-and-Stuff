import java.util.*;
public class checkiffibo {
	
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
		checkiffibo hello = new checkiffibo();
		Scanner sc = new Scanner(System.in);
		try{
		int n = sc.nextInt(); //{Print the nth fibonacci number
		int count = 2;		
		}
		catch(Exception e){
			
		}
		while(true){
			if (hello.fibo(count)==n){
				System.out.println("Yes - it is a fibonacci");
				break;
			}
			else if(hello.fibo(count)>n){
				System.out.println("No - it is not a fibonacci");
				break;				
			}
			count++;			
		}		
	}
}






