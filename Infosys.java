import java.util.*;
public class Infosys {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		ArrayList <Integer> list = new ArrayList <Integer>();
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		
		int arr2[]= new int[n];
		for(int j=0; j<n; j++)
		{
			arr2[j]= sc.nextInt();
		}
		
		int w=0;
	    int count=0;
		while( w<n )
		{

			if(list.get(w)<=p)
			{
				p=p+arr2[w];
				list.remove(list.get(w));
				n=n-1;
				w=0;
				count++;
				
			}
			else
			w++;
			
			
		}
		System.out.println(count);
		
	}
}
