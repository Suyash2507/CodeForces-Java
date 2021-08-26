import java.util.*;
public class BoyorGirl {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String s=S.next();int z=0;
		ArrayList<Character> l1=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			if(!l1.contains(s.charAt(i))) {
				z++;
				l1.add(s.charAt(i));
			}
		}
		if(z%2==0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
