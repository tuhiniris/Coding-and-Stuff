// Java program to find minimum Increment or
// decrement to make array elements equal
import java.util.*;
class GfGA {

// Function to return minimum operations need
// to be make each element of array equal
static int minCost(int A[], int n)
{
	// Initialize cost to 0
	int cost = 0;
	int ans = 0;

	// Sort the array
	Arrays.sort(A);

	// Middle element
	int K = A[n / 2];

	// Find Cost
	for (int i = 0; i < n; ++i)
	{
		cost += Math.abs(A[i] - K);
		ans = ans+cost;
	}

	// If n, is even. Take minimum of the
	// Cost obtained by considering both
	// middle elements
	if (n % 2 == 0) {
		int tempCost = 0;

		K = A[(n / 2) - 1];
		

		// Find cost again
		for (int i = 0; i < n; ++i){
			tempCost += Math.abs(A[i] - K);
			ans = ans+tempCost;
		}

		// Take minimum of two cost
		cost = Math.min(cost, tempCost);
	}

	// Return total cost
	System.out.println(ans);
	return cost;
}

// Driver Code
public static void main(String[] args)
{
	int A[] = { 2849,1620,705,1,30 };

	int n = A.length;

	System.out.println(minCost(A, n));
}
}
