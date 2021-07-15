import java.util.*;
import java.io.*;
public class bufferedhoop {
   static int r, t=0, m=0, e=0, v=0, q=0;
	static long x=0, g=0;
		public static void main (String[] args)throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();
		sc.close();
		
		int n= str.length();
		int i=0, j=1, a=0, b=0;
		long y=0;
		
		char item= 'M';
		while(i<n && j<n)
		{
			if(item=='M')
			{
				
			if(str.charAt(i)==item || str.charAt(j)==item)
			{
				if(str.charAt(i)==item && str.charAt(j)!=item)
				{
                      
					if(j<n-1)
					{
				
						j++;
					}
					else
					{
						i++;
						j=i+1;
					}
				}
				else if(str.charAt(i)!=item && str.charAt(j)==item)
				{
					i++; j++;
				}
				else if(str.charAt(i)==item && str.charAt(j)==item)
				{
					item= 'O';
					a=i; b=j;
				    if(j==n-1 && i!=j)
				    {
						i++;
						j=i+1;
					}
					else if(j<n-1)
					{
						j++;
					}
					 
				}
				}
			
			else if(str.charAt(i)!=item && str.charAt(j)!=item)
			{
				i++; j++;
			}
				
			}
		else if(item=='O')
		{
			
			if(a==t && m+1!=b)
			{
				r=m+1;
				
			}
			else {
				r=a+1;
			 x=0;
		 }
			for(int w= r; w<b; w++)
			{
				if(str.charAt(w)=='O')
				{
				x++;
			}
			 t=a;  m=b;
			}
			y= x+y;
			item= 'M';

			
		}
		
			
		}
		 i=0; j=1; a=0; b=0;
		 long z=0;
		 item= 'D';
		while(i<n && j<n)
		{
			if(item=='D')
			{
				
			if(str.charAt(i)==item || str.charAt(j)==item)
			{
				if(str.charAt(i)==item && str.charAt(j)!=item)
				{
                      
					if(j<n-1)
					{
				
						j++;
					}
					else
					{
						i++;
						j=i+1;
					}
				}
				else if(str.charAt(i)!=item && str.charAt(j)==item)
				{
					i++; j++;
				}
				else if(str.charAt(i)==item && str.charAt(j)==item)
				{
					item= 'A';
					a=i; b=j;
				    if(j==n-1 && i!=j)
				    {
						i++;
						j=i+1;
					}
					else if(j<n-1)
					{
						j++;
					}
					 
				}
				}
			
			else if(str.charAt(i)!=item && str.charAt(j)!=item)
			{
				i++; j++;
			}
				
			}
		else if(item=='A')
		{
			if(a==e && q+1!=b)
			{
				v=q+1;
				
			}
			else {
				v=a+1;
			 g=0;
		 }
			
			for(int w=v; w<b; w++)
			{
				if(str.charAt(w)=='A')
				{
				g++;
			}
			 e=a;  q=b;
			}
			z= g+z;
			item= 'D';

			
		}
		
			
		}
			System.out.println(y+z);
		
	}
}
