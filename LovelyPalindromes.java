import java.util.*;//688B
import java.lang.*;
public class LovelyPalindromes {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String n=S.next();
		StringBuilder m=new StringBuilder(n);  
	    m.reverse();
		String t=n+m.toString();
		System.out.println(t);
	}
}
