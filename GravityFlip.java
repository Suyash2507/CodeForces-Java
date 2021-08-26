import java.util.*;
public class GravityFlip {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}
	}
}
