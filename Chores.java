import java.util.*;
public class Chores {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int k=S.nextInt();
		int x=S.nextInt();
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		Arrays.sort(arr);
		for(int j=1;j<=k;j++) {
			arr[n-j]=x;
		}
		for(int j=0;j<n;j++) {
			sum=sum+arr[j];
		}
		System.out.println(sum);
	}
}
