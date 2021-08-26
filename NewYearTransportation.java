import java.util.*;
public class NewYearTransportation {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int t=S.nextInt();boolean flag=false;int[] arr=new int[n+1];
		for(int i=1;i<n;i++) {
			arr[i]=S.nextInt();
		}arr[n]=1;
		for(int j=1;j<=n;j=j+arr[j]) {
			if(t==j) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
				
	}
}
