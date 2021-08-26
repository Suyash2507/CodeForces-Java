import java.util.*;
public class Reconnaissance {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=S.nextInt();
		}
		int m=Math.abs(ar[n-1]-ar[0]);
		int m1=1;
		int m2=n;
		for(int j=0;j<n-1;j++) {
			if(Math.abs(ar[j+1]-ar[j])<m) {
				m=Math.abs(ar[j+1]-ar[j]);
				m1=j+1;m2=j+2;
			}
		}
		System.out.println(m1+" "+m2);
	}
}
