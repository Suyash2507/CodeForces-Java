import java.util.*;
public class Word {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int c1=0,c2=0;
		String s=S.next();
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(0))) {
				c1++;
			}else if(Character.isLowerCase(s.charAt(0))) {
				c2++;
			}
		}String z="";
		if(c1>c2) {
			for(int j=0;j<s.length();j++) {
				z=z.concat(String.valueOf(Character.toUpperCase(s.charAt(j))));
			}
		}
		else {
			for(int j=0;j<s.length();j++) {
				z=z.concat(String.valueOf(Character.toLowerCase(s.charAt(j))));
			}
		}
		System.out.println(z);
	}
}
