import java.util.*;
public class HelpFarAwayKingdom {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		float f=S.nextFloat();
		long s1=(long) f;
		float s2= f-s1;
		String s=String.valueOf(s1);
		if(s.charAt(s.length()-1)=='9') {
			System.out.println("GOTO Vasilisa.");
		}
		else if(s2>=0.5 && s.charAt(s.length()-1)!='9') {
			System.out.println(s1+1);
		}
		else if(s2<0.5 && s.charAt(s.length()-1)!='9') {
			System.out.println(s1);
		}
	}
}
