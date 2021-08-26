import java.util.*;
public class FakeNP {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int l=S.nextInt();
		int r=S.nextInt();
		if(l%2!=0 && l==r) {
			System.out.println(r);
		}else {
			System.out.println("2");
		}
	}
}
