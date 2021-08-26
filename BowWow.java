import java.util.*;//798A
public class BowWow {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String n=S.next();
		int d=Integer.parseInt(n,2);
		int count=0;
		while(d/4>=1) {
			count++;
			d=d/4;
		
		}
		System.out.println(count);
	}
}
