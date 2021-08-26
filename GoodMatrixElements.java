import java.util.*;
public class GoodMatrixElements {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int[][] arr=new int[n][n];
		ArrayList<String> l1=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=S.nextInt();
			}
		}
		int k=n/2;int sum=0;
		for(int m=0;m<n;m++) {
			sum=sum+arr[m][k];
			String z=String.valueOf(m).concat(String.valueOf(k));
			l1.add(z);
		}
		for(int p=0;p<n;p++) {
			if(p!=k) {
				sum=sum+arr[k][p];
				String z=String.valueOf(k).concat(String.valueOf(p));
				l1.add(z);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				String b=String.valueOf(i).concat(String.valueOf(j));
				if(((i+j) == (n-1) && !l1.contains(b)) || (i==j) && !l1.contains(b)) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);
		
	}
}
