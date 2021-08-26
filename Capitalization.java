import java.util.*;
public class Capitalization {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String s=S.next();
		String k=String.valueOf(Character.toUpperCase(s.charAt(0)));
		k=k.concat(s.substring(1,s.length()));
		System.out.println(k);
	}
}
