
public class LCS {
	public static int LongestCommonSubsequence(char[] a, char[] b){
		int m=a.length;
		int n=b.length;
		int[][] c=new int[m+1][n+1];
		for (int i=0;i<=m;i++){
			c[i][0]=0;
		}
		for (int j=0;j<=n;j++){
			c[0][j]=0;
		}
		for (int i=1;i<=m;i++){
			for (int j=1;j<=n;j++){
				if (a[i-1]==b[j-1]){
					c[i][j]=1+c[i-1][j-1];
				}else{
					c[i][j]=Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		return c[m][n];
	}
	
	public static void main(String[] args){
		char[] a={'A','B','C','B','D','A','B'};
		char[] b={'B','D','C','A','B','A'};
		System.out.println(LongestCommonSubsequence(a, b));
	}
}
