import java.util.*;
import java.lang.*;
public class Reconaissance {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int d=S.nextInt();
		int count=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) {
				if(j!=k) {
					int z=(arr[k]-arr[j]);
					if(Math.abs(z)<=d){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
