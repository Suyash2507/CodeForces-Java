import java.util.*;
public class SecondPriceAuction {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();int max=0,in=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
			if(arr[i]>max) {
				max=arr[i];
				in=i+1;
			}
		}
		Arrays.sort(arr);
		System.out.println(in);
		System.out.println(arr[n-2]);
	}
}
