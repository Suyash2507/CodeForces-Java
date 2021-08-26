import java.util.*;
public class Fence {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int k=S.nextInt();
		int[] arr=new int[n];
		int sum=0,res=1,z=0,sum1=0,p=0;;
		for(int i=0;i<n;i++) {
			if(i<3) {
				arr[i]=S.nextInt();
				sum=sum+arr[i];
			}
			else {
				int a=S.nextInt();
				sum1=sum;
				sum=sum-arr[p++]+a;
				if(sum<sum1) {
					sum1=sum;
					z=res;
				}
				res++;
			}
		}
		System.out.println(z);
	}
}
