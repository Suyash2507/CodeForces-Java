import java.util.*;
public class Ihate1111 {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		boolean flag=false;
		int t=S.nextInt();
		while(t>0) {
			int z=0;
			int n=S.nextInt();
			if(n<=10) {
				System.out.println("NO");
				flag=true;
			}
			if(!flag) {
				if(n%11==0 || n%111==0 || n%1111==0 || n%11111==0 || n%111111==0 || n%1111111==0 || n%11111111==0 || n%111111111==0) {
					System.out.println("YES");
				}else {
					while(n>=111) {
						n=n-111;
						if(n%11==0) {
							z=1;
							break;
						}
					}
					if(z==1) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}
				}
			}
			t--;
		}
		
	}
}
