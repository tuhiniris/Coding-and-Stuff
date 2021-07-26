/*
 * sumd.java
 * 
 * Copyright 2021 Kajal <Kajal@DESKTOP-MK9EA90>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;
public class sumd {
	static 	int count=0;
	static void findsum(int n)
	{
		int c=0;
		int item=0;
		int i=1;
		while(i!=item)
		{
			if(n%i==0)
			{
				c=c+i+(n/i);
				item=n/i;
			}
			i++;
		}
		System.out.println(c);
	}
	static void unique(int arr[], int n)
	{
		
	    HashMap <Integer, Integer> map= new HashMap<Integer, Integer>();
	    for(int i=0; i<n; i++)
	    {
			
				map.put(arr[i],i);
				
		}
		System.out.println(map.size());
	}
	static void checkp(String str)
	{
	
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='{'||str.charAt(i)=='}')
			{
				count++;
			} 
		} 
		if(count%2==0)
		{
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
		
	}
	public static void subst(String str, String subs)
	{
		if(str.contains(subs))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		}
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		int n= sc.nextInt();  //same for all function
	  findsum(n);
	   int arr[]= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		unique(arr, n);
		* 
		*/
		while(sc.hasNextLine())
		{
		    
			String s= sc.nextLine();
            String str= s.trim();
		checkp(str);
		}
		/*
	
		String tr= sc.next();
		String gf= sc.next();
		subst(tr, gf);
		*/

	}
}
