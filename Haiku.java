import java.util.*;
public class Haiku {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String a=S.nextLine();int a1=0,b1=0,c1=0;
		String b=S.nextLine();
		String c=S.nextLine();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
				a1++;
			}
		}for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u') {
				b1++;
			}
		}for(int i=0;i<c.length();i++) {
			if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i)=='o' || c.charAt(i)=='u') {
				c1++;
			}
		}
		if(a1==5 && b1==7 && c1==5) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
