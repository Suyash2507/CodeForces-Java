import java.util.*;
public class UniversityEntrance {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n/2]);
	}
}
