/*
 * lexicrographic.java
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


import java.util.Arrays;
 
public class lexicrographic
{
	static int[] sjs(int arr2[])
	{
		int ar3[]= new int[2];
		for(int t=0; t<2; t++)
		{
			ar3[t]=arr2[t];
		}
		    int m=1;
        int count=0;
        while(m<ar3.length)
        {
			System.out.println(ar3.length);
	   	if(ar3[m]%ar3[m-1]==0 )
		{
			m++;
		}
		else if(ar3[m]%ar3[m-1]!=0)

			count++;

		}
		if(count==0){
			
			         for(int j=0; j<ar3.length; j++)
        {
			
			System.out.print(ar3[j]+" ");
			
		
		}
		System.out.println();
		}
		return arr2;
	}
    public static void findLexicographic(char[] chars, String output) 
    {
		
        if (output.length() == 2)
        {
			int arr2[]=new int[2];
			 for (int i = 0; i < output.length(); i++) {
            arr2[i] = Integer.parseInt(String.valueOf(output.charAt(i)));
        }
        sjs(arr2);
        System.out.println("ksjnkj");
         for(int j=0; j<arr2.length; j++)
        {
			System.out.print(arr2[j]+" ");
			
		
		}
		System.out.println();
	
        
            return;
		
        }
	
 
        for (char c: chars) {
            findLexicographic(chars, output + c);
        }
    }
 
    public static void findLexicographic(String str)
    {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
 
        findLexicographic(chars, "");
    }
 
    public static void main(String[] args)
    {
		int arr[]= {1, 2, 3};
		String str="";
		for(int i=0; i<3; i++)
		{
			str=str+Integer.toString(arr[i]);
		}
       // System.out.println(str); 
        findLexicographic(str);
   
}
}


/*
  System.out.println(arr2[1]);
        int m=1;
        int count=0;
        while(m<arr2.length)
        {
	   	if(arr2[m]%arr2[m-1]==0 )
		{
			m++;
		}
		else if(arr2[m]%arr2[m-1]!=0)

			count++;

		}
		if(count==0)*/
