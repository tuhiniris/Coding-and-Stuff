/*
 * iemco2.java
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
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class Codechef {
      static HashMap<Long,Integer> list=new HashMap<>();
    static long data[]=new long[3];
   static long pow=(long)Math.pow(10,18);
	static void combinationUtil(long arr[], long data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
			long k=0;
            for (int j=0; j<r; j++)
			{	
				k=k+data[j];
			}
			if(list.containsKey(k))
				list.put(k,list.get(k)+1);
            else
				list.put(k,1);
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
       
        int n=sc.nextInt();
       
		 long[] array= new long[n];
		array[0]= sc.nextInt();
		int q= sc.nextInt();
		long qrr[]= new long[q];
		for(int d=0; d<q; d++)
		{
			qrr[d]=sc.nextInt();
		}
		 
		for(int h=1; h<n; h++)
		{
			if(h%2==1)
			{
			array[h]= 3*array[h-1];
			} 
			else 
				array[h]= 2*(array[h-1]+array[h-2]);
			if(array[h]>pow)
                break;
		
		} 
	      combinationUtil(array, data, 0, n-1, 0, 3);
	     // System.out.println(list);
	   
	  for(int h=0; h<q; h++)
		{   int count=0;
			for(long y : list.keySet())
			{
				//System.out.println("y= "+y);
				if(qrr[h]%y==0)
				{
					count++;
				}
			} System.out.println(count);
		}
	}
}
