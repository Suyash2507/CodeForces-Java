import java.util.*;
public class Twins {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();int s=0;int c=0;
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=S.nextInt();
			s=s+ar[i];
		}
		Arrays.sort(ar);int t=0;
		for(int j=0;j<n;j++) {
			t=t+ar[j];
			c++;int z=0;
			for(int k=j;k<n;k++) {
				z=z+ar[k];
			}
			if(t>z) {
				break;
			}
		}
		System.out.println(c);
	}
}
