import java.util.*;
public class Rewards {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a1=S.nextInt();
		int a2=S.nextInt();
		int a3=S.nextInt();
		int b1=S.nextInt();
		int b2=S.nextInt();
		int b3=S.nextInt();
		int n=S.nextInt();int s1,s2;
		s1=((a1+a2+a3)%5!=0)?1+((a1+a2+a3)/5):(a1+a2+a3)/5;
		s2=((b1+b2+b3)%10!=0)?1+((b1+b2+b3)/10):(b1+b2+b3)/10;
		if(n>=(s1+s2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
