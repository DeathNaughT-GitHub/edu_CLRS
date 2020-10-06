import java.util.*;
public class LongestCommonSubsequence 
{ 

/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
public static int lcs( char[] X, char[] Y, int m, int n ) 
 { 
	int L[][] = new int[m+1][n+1]; 

	/* Following steps build L[m+1][n+1] in bottom up fashion. Note 
		that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	for (int i=0; i<=m; i++) 
	{ 
	for (int j=0; j<=n; j++) 
	{ 
		if (i == 0 || j == 0) 
			L[i][j] = 0; 
		else if (X[i-1] == Y[j-1]) 
			L[i][j] = L[i-1][j-1] + 1; 
		else
			L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
	} 
	} 
  return L[m][n]; 
} 

public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
	String s1 = sc.next(); 
	String s2 = sc.next(); 

	char[] X=s1.toCharArray(); 
	char[] Y=s2.toCharArray(); 
	int m = X.length; 
	int n = Y.length; 

	System.out.println("Length of Longest Common Subsequence is" + " : " + 
								lcs( X, Y, m, n ) ); 
} 

} 
/*
 * Sample Input
 * AGGTAB
 * GXTXAYB
 * Sample Output
 * Length of Longest Common Subsequence is : 4
 */
