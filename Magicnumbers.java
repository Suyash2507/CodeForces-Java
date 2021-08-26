import java.util.*;//320A
public class Magicnumbers {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int flag=0;
		String t = String.valueOf(n);
		t = t.replaceAll("144"," ");
		t = t.replaceAll("14"," ");
		t = t.replaceAll("1"," ");
		for(int i=0;i<t.length();i++) {
			char z=t.charAt(i);
			if(Character.isWhitespace(z)) {
				continue;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
