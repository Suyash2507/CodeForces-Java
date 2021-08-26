import java.util.*;//1312B
public class BogoSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for(int m=0;m<q;m++) {
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			Arrays.sort(arr);
			for(int p=n-1;p>=0;p--) {
				System.out.print(arr[p]+" ");
			}
			System.out.println("");
		}
	}
}