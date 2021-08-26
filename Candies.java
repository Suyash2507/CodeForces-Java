import java.util.*;
public class Candies {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int m=S.nextInt();
		int a=n%m;
		int b=n/m;
		if(a==0) {
			for(int i=0;i<m;i++){
				System.out.println(b);
			}
		}
		else {
			for(int j=0;j<a;j++) {
				System.out.println(b+1);
			}
			for(int k=0;k<(m-a);k++) {
				System.out.println(b);
			}
		}
	}
}
