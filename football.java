import java.util.*;
public class football {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int c1=1,c2=0;
		String s=S.next();String g="";
		while(n>1) {
			String k=S.next();
			if(k.equals(s)) {
				c1++;
			}
			else {
				g=k;
				c2++;
			}
			n--;
		}
		if(c1>c2) {
			System.out.println(s);
		}else {
			System.out.println(g);
		}
	}
}
