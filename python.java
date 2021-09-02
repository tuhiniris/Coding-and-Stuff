/*
 * python.java
 * 
 * Copyright 2021 MERN <MERN@TCANDAXE-PC>
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


public class python {
	
	public static void main (String[] args) {
		int a,b,c,d;
		b=18;
		c=12;
		a=b-c;
		for(c=1;c<=a-1;c++){
			b=b+c+12;
			b=b/5;
			d=b+a;
		}
		c=a+b+c;
		System.out.println(a+" "+b+" "+c);
	}
}

