import java.util.Arrays;//34B
import java.util.Scanner;//556A
public class bobsale {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int m=S.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		Arrays.sort(arr);
		int p=0,max=0;
		while(m!=0) {
			if(arr[p]<0) {
				max=max+(-1*arr[p]);
			}
			m--;
			p++;
		}
		System.out.print(max);
	}
}
