import java.util.*;
public class InterestingDrinks {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		int q=S.nextInt();
		Arrays.sort(arr);
		for(int j=0;j<q;j++) 
		{
			int m=S.nextInt();
			int c=0;
			if(arr[n-1]<=m) {
				System.out.println(n);
			}else if(m<=arr[n/2]) {
				for(int k=0;k<n;k++) {
					if(arr[k]<=m) {
						c++;
					}
					else {
						break;
					}
				}
				System.out.println(c);
			}
			else {
				for(int k=n-1;k>=0;k--) {
					if(arr[k]>m) {
						c++;
					}
					else {
						break;
					}
				}
				System.out.println(n-c);
			}
		}
	}
}
