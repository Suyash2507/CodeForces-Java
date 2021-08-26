import java.util.*;//1498A
import java.math.*;
public class GCDsum {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			String n=S.next();
			int m=Integer.parseInt(n);
			while(true) {
				int sum=0;
				BigInteger b= new BigInteger(String.valueOf(m));
				for(int i=0;i<String.valueOf(m).length();i++) {
					sum=sum+Integer.parseInt(String.valueOf(String.valueOf(m).charAt(i)));
				}
				BigInteger b2=b.gcd(new BigInteger(String.valueOf(sum)));
				if(b2.intValue()>1) {
					System.out.println(m);
					break;
				}else {
					m++;
				}
			}
			t--;
		}
	}
}
