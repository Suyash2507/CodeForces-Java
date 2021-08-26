import java.util.*;//1492A
public class ThreeSwimmers {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int k=S.nextInt();
		while(k>0) {
			long p =S.nextLong();
			long a =S.nextLong();
			long b =S.nextLong();
			long c =S.nextLong();
			if(p%a==0 || p%b==0 || p%c==0) {
				System.out.println("0");
			}
			else {
				long n1 =(p/a)*a+a;long m=n1-p;
				long n2 =(p/b)*b+b;long q=n2-p;
				long n3 =(p/c)*c+c;long r=n3-p;
				System.out.println((m>q)?(q>r?r:q):(m>r)?r:m);
			}
			k--;
		}	
	}
}
