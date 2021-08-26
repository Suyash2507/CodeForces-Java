import java.util.*;
public class CompilationErrors {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n= S.nextInt();
		int a=0;
		int b=0;
		int c=0;
		for(int i=0;i<n;i++) {
			int p=S.nextInt();
			a=a+p;
		}
		for(int j=0;j<n-1;j++) {
			int q=S.nextInt();
			b=b+q;
		}
		for(int k=0;k<n-2;k++) {
			int r=S.nextInt();
			c=c+r;
		}
		System.out.println(a-b);
		System.out.println(b-c);
	}
}