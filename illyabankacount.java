import java.util.Scanner;
public class illyabankacount {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		if(n>=0) {
			System.out.println(n);
		}
		else {
			String m=String.valueOf(n);
			int a=Integer.parseInt(String.valueOf(m.substring(0,m.length()-1)));
			int b=Integer.parseInt((String.valueOf(m.substring(0,m.length()-2))).concat(String.valueOf(m.charAt(m.length()-1))));
			if(a>b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
	}
}
