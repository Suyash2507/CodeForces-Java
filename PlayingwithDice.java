import java.util.*;
public class PlayingwithDice {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a =S.nextInt();
		int b =S.nextInt();
		int p=0,q=0,r=0;
		for(int i=1;i<=6;i++) {
			if(Math.abs(a-i)<Math.abs(b-i)) {
				p++;
			}else if(Math.abs(a-i)==Math.abs(b-i)) {
				q++;
			}
			else if(Math.abs(a-i)>Math.abs(b-i)) {
				r++;
			}
		}
		System.out.println(p+" "+q+" "+r);
	}
}
