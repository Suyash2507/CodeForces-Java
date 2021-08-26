import java.util.Scanner;//556A
public class caseofzeroones {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		String b=S.next();
		int c1=0,c2=0;
		for(int i=0;i<n;i++)
			if(b.charAt(i)=='1')
				c1++;
			else
				c2++;
		System.out.println(Math.abs(c1-c2));
		/*do {
			for(int i=0;i<b.length()-1;i++) {
				if((b.charAt(i)=='1' && b.charAt(i+1)=='0') || (b.charAt(i)=='0' && b.charAt(i+1)=='1')) {
					b=b.replace
				}
			}
		}while(flag!=1);
		*/
	}
}
