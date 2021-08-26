import java.util.*;
public class TranslationVasya {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String k=S.next();
		String p=S.next();
		StringBuilder sb=new StringBuilder();sb.append(p);
		if(sb.reverse().toString().equals(k)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
