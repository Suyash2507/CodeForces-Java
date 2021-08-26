import java.util.*;
public class DeclinedFinalists {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		Arrays.sort(arr);
		if(arr[n-1]<=25) {
			System.out.println(0);
		}else {
			System.out.println(arr[n-1]-25);
		}
	}
}
