import java.util.*;
public class IfYoudontSucced {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int c=S.nextInt();
		int n=S.nextInt();
		int k=n-c-(a-c)-(b-c);
		if(k>0 && c>=0 && a>=c && b>=c) {
				System.out.println(n-(a-c)-(b-c)-c);
		}
		else {
			System.out.println("-1");
		}
	}
}