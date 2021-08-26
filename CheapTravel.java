import java.util.*;
public class CheapTravel {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int m=S.nextInt();
		int a=S.nextInt();
		int b=S.nextInt();
		if((b/m)<a) {
			int min1=(n/m)*b;
			min1=min1+(n%m)*a;
			int min2=n/m*b;
			min2=min2+b;
			System.out.println((min1>min2)?min2:min1);
		}else {
			System.out.println(a*n);
		}
	}
}
