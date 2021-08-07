import java.util.*;
public class kkp {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,temp,j;
		N = sc.nextInt();
		int[] arr;
		arr = new int[N];
		for (int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		int flag;
		flag = sc.nextInt();
		
		    while(flag>0)
    {
        temp=arr[0];
        for(j=0;j<N-1;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[N-1]=temp;
        flag--;
    }
    System.out.println(Arrays.toString(arr)); // Output format ta dekhe nish, for loop lagte pare		
	}
}
