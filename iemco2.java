import java.util.*;
public class iemco2 {
    static ArrayList <Long> list = new ArrayList <Long>(); 
    static long data[]=new long[3];
	static void combinationUtil(long arr[], long data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
			long k=0;
            for (int j=0; j<r; j++)
				k=k+data[j];
           list.add(k);
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		 int n = sc.nextInt();
		 long[] array= new long[n];
		array[0]= sc.nextLong();
		int q= sc.nextInt();
		long qrr[]= new long[q];
		for(int i=0; i<q; i++)
		{
			qrr[i]=sc.nextLong();
		}
		for(int j=1; j<n; j++)
		{
			if(j%2!=0)
			{
			array[j]= 3*array[j-1];
			} 
			else 
				array[j]= 2*(array[j-1]+array[j-2]);
		
		} 
	      combinationUtil(array, data, 0, n-1, 0, 3);
	      int p= list.size();
	      System.out.println(list);
	  for(int i=0; i<q; i++)
		{   int count=0;
			for(int y=0; y<p; y++)
			{
				if(qrr[i]%list.get(y)==0)
					count++;
			} System.out.println(count);
		}
	}
}

/*
 * 

100
2
3
1344
70
100

*/
