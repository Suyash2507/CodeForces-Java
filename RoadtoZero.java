import java.util.*;
public class RoadtoZero {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int x=S.nextInt();
			int y=S.nextInt();
			int a=S.nextInt();
			int b=S.nextInt();
			if(x==0 && y==0) {
				System.out.println(0);
			}else if(x==0 || y==0) {
				if(x==0) {
					System.out.println(y*a);
				}
				else {
					System.out.println(x*a);
				}
			}
			else {
				int max=(x>y)?x:y;
				int min=(x>y)?y:x;
				if(2*a<=b) {
					System.out.println((max*a) + (min*a));
				}
				else {
					System.out.println(((max-min)*a) + (min*b));
				}
			}
			t--;
		}
	}
}
