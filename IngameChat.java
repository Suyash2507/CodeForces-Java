import java.util.*;
public class IngameChat {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int n=S.nextInt();
			String s=S.next();
			int c=0;
			if(n==1 && s.equals(")")) {
				System.out.println("Yes");
			}else {
				for(int i=n-1;i>=0;i--) {
					if(s.charAt(i)==')') {
						c++;
					}
					else {
						break;
					}
				}
				int z=n-c;
				if(c>z) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			t--;
		}
	}
}
