import java.util.*;
public class NewYearCandles {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int count=a;
		while(a/b!=0) {
			count=count+a/b;
			a=a/b+a%b;
		}
		System.out.println(count);
	}
}
