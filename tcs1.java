/*
 * tcs1.java
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
public class tcs1 {
	static HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	public static void findmjp(int arr[])
	{
		if(arr.length==1)
		{
			System.out.println(arr[0]);
		}
		if(arr.length==2)
		{
			System.out.println(Math.max(arr[0]+arr[1], 2*arr[1]));
		}
		else
		{
		int max=Math.max(arr[0]+arr[1], 2*arr[1]);
		int dou=1;
		int arr2[]=new int[arr.length];
		Arrays.sort(arr2, 2, arr.length);
		map.put(0, arr[0]);
		map.put(1, max);
		int a=0, b=0, c=0;
		for(int i=2; i<arr.length; i++)
		{
			if(dou!=0)
			{
				if(i==2)
				{
					a=arr[i]*3;
					b=arr[i]*2+map.get(i-2);
					max=Math.max(a, b);
					map.put(i, max);
					dou--;
				}
				else
				{
				a=arr[i]*3+map.get(i-3);
				b=arr[i]*2+map.get(i-2);
				c=arr[i]+map.get(i-1);
				max= Math.max(Math.max(a, b), c);
				if(max==a)
				{
					dou--;
				}
				}
			}
			else
			{
				b=arr[i]*2+map.get(i-2);
				c=arr[i]+map.get(i-1);
				max= Math.max(c, b);
				map.put(i, max);
			}
		}
		} 
	}
	public static void main (String[] args) {
		int arr[]={4,5,6,7,4,5};
		findmjp(arr);
	    System.out.println(map.get(arr.length-1));
	}
}
