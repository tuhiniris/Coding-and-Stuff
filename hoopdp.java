// A Dynamic Programming based
// Java program to find the
// number of times the second
// string untitledoccurs in the first
// string, whether continuous
// or discontinuous
import java.io.*;
import java.util.*;

class hoopdp
{
	
// Iterative DP function to
// find the number of times
// the second string occurs
// in the first string, whether
// continuous or discontinuous
static int count(String a, String b)
{
	int m = a.length();
	int n = b.length();

	// Create a table to store
	// results of sub-problems
	int lookup[][] = new int[m + 1][n + 1];

	// If first string is empty
	for (int i = 0; i <= n; ++i)
		lookup[0][i] = 0;

	// If second string is empty
	for (int i = 0; i <= m; ++i)
		lookup[i][0] = 1;

	// Fill lookup[][] in
	// bottom up manner
	for (int i = 1; i <= m; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			// If last characters are
			// same, we have two options -
			// 1. consider last characters
			// of both strings in solution
			// 2. ignore last character
			// of first string
			if (a.charAt(i - 1) == b.charAt(j - 1))
				lookup[i][j] = lookup[i - 1][j - 1] +
							lookup[i - 1][j];
				
			else
				// If last character are
				// different, ignore last
				// character of first string
				lookup[i][j] = lookup[i - 1][j];
		}
	}

	return lookup[m][n];
}

// Driver Code
public static void main (String[] args)throws Exception
{
	FileReader fr=new FileReader("C:\\Coding and Stuff\\momo48000.txt");
	BufferedReader sc = new BufferedReader(fr);
	String a = sc.readLine();
	String b = "MOM";
	String c = "DAD";
	
	System.out.println((count(a, b))+(count(a, c)));
	sc.close();
}
}

// This code is contributed by anuj_67.
