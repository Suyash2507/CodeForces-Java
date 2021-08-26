import java.util.*;
public class Puzzles {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int min=999999999;
		int n=S.nextInt();int z=n-1;
		int m=S.nextInt();
		int ar[]=new int[m];
		for(int i=0;i<m;i++) {
			ar[i]=S.nextInt();
		}
		Arrays.sort(ar);
		for(int j=0;j<m;j++) {
			int temp=ar[j]+ar[n-1+z++];
			min=temp<min?temp:min;
		}
	}
}
