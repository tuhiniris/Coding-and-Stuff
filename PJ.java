import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class PJ {
	
	public static int moveApples(int input1,int[] input2){
		Arrays.sort(input2);
		System.out.println(Arrays.toString(input2));
		for(int i=0;i<input1;i++){
			int temp = input2[input1-(i+1)];
			input2[input1-(i+2)]=temp;			
		}
		System.out.println(Arrays.toString(input2));
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}	
		System.out.println(moveApples(n,arr));				
	}
}

/*

5
2849 1620 705 1 30

*/
