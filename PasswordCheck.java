import java.util.*;
public class PasswordCheck {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String s=S.next();
		if(s.length()<5) {
			System.out.println("Too weak");
		}
		else {
			int a=0,b=0,c=0;
			for(int i=0;i<s.length();i++) {
				if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) || s.charAt(i)=='!' || s.charAt(i)=='?' || s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)=='_')
				{
					if(Character.isUpperCase(s.charAt(i))) 
					{
						a++;
					}
					else if(Character.isLowerCase(s.charAt(i))){
						b++;
					}
					else if(Character.isDigit(s.charAt(i))) {
						c++;
					}
				}
				else {
					System.out.println("Too weak");
				}
			}
			if(a>=1 && b>=1 && c>=1) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Too weak");
			}
		}
	}
}
