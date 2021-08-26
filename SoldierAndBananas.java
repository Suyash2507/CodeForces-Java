import java.util.*;
public class SoldierAndBananas {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int k=S.nextInt();
		int n=S.nextInt();
		int w=S.nextInt();int s=0;
		for(int i=1;i<=w;i++) {
			s=s+(k*i);
		}
		if(n>=s) {
			System.out.println(0);
		}else {
			System.out.println(s-n);
		}
	}
}
