import java.util.*;
public class DZYLovesHash {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int p=S.nextInt();
		int n=S.nextInt();
		int[] arr=new int[p];
		for(int i=0;i<n;i++) {
			arr[i]=0;
		}int c=0;
		boolean bol=true;
		for(int j=0;j<n;j++) {
			int a=S.nextInt();
			int b=a%p;
			if(arr[b]<1) {
				arr[b]++;
				c++;
			}else {
				c++;
				bol=false;
				break;
			}
		}
		if(bol) {
			System.out.println(-1);
		}else {
			System.out.println(c);
		}
	}
}
