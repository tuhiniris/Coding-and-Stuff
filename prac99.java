/*
 * prac99.java
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
public class prac99 {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	 static void findans(int n, int y, int x)
	{ //n = 5
		if(y<=n)
		{
	     if(x==y)
		{
			y++;
			findans(n, y, x);
		}
		else if(y>x)
		{
			
			 if(x%5==0 && x+5<=n)
			{
				list.add(5);
				x=x+5;
				y=x;
				findans(n, y, x);
			}
			else if(x%5!=0 && x+2<=n || x%5==0 && x+5>n && x+2<=n)
			{
				list.add(2);
				x=x+2;
				y=x;
				findans(n, y, x);
			}
			else if(x%5!=0 && x+1<=n || x%5==0 && x+5>n && x+2>n)
			{
				list.add(1);
				x=x+1;
				y=x;
				findans(n, y, x);
			}
		}
	}
}

 public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		list.add(1);
		findans(n, 1, 1);
		int count=0, cout=0, cnt=0;
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)==1)
			{
				count++;
			}
			else if(list.get(i)==2)
			{
				cout++;
			}
			else if(list.get(i)==5)
			{
				cnt++;
			}
		}
		System.out.println(list);
		System.out.println(count+cout+cnt);
	}
}

// N  = 13
1 
