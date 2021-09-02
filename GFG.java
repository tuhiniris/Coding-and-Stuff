import java.io.*;
import java.util.*;

public class GFG {

public static int maxSumSubArray(ArrayList<Integer>input, int k) {
		int n = input.size();
		if(k > n || k == n) return 0;
		
		int sum = input.get(0);
		for(int i = 1; i < k; i++) {
			sum += input.get(i);
		}
		
		int maxSum = sum;
		
		for(int i = k; i < n; i++) {
			sum = sum - input.get(i-k) + input.get(i);
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args)
	{
	ArrayList<Integer>arr = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				arr.add(sc.nextInt());
			}
	int max_sum = maxSumSubArray(arr,n);
	System.out.println(max_sum);
	}
}
