import java.util.*;
public class SifidAndStrange {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int n=S.nextInt();
			int m=-999999999;int c=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=S.nextInt();
				if(arr[i]>m) {
					m=arr[i];
				}
			}
			for(int j=0;j<n;j++) {
				if(Math.abs(m-arr[j])<m && m!=arr[j]) {
					c=c+1;
				}
			}
			System.out.println(n-c);
			t--;
		}
	}
}
