import java.util.*;
public class SerejaCupGame {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int s=S.nextInt();
		int max=0,sum=0;
		for(int i=0;i<n;i++) {
			int k=S.nextInt();
			sum=sum+k;
			if(k>max) {
				max=k;
			}
		}
		if((sum-max)<=s) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
