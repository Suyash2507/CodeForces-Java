import java.util.*;
public class GameOutcome {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();int total=0;
		if(n==1) {
			System.out.println(0);
		}
		else {
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=S.nextInt();
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int a=arr[i][j];
					int r=0,c=0;
					for(int k=0;k<n;k++) {
						r=r+arr[i][k];
						c=c+arr[k][j];
					}
					if(c>r) {
						total++;
					}
				}
			}
			System.out.println(total);
		}
	}
}
