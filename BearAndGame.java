import java.util.*;
public class BearAndGame {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++) {
			if(j==0) {
				if(arr[j]>15) {
					sum=sum+15;
					break;
				}
				else {
					sum=arr[j];
				}
			}
			else
			{
				int k=arr[j]-arr[j-1];
				if(k>15) {
					sum=sum+15;
					break;
				}else {
					sum=arr[j];
				}
			}
		}
		if(n==1) {
			if(arr[0]<=15) {
				System.out.println(arr[0]+15);
			}
			else {
				System.out.println(15);
			}
		}
		else if(sum==arr[n-1]) {
			System.out.println(90);
		}
		else {
			System.out.println(sum);
		}
	}
}
