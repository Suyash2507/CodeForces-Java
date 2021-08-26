import java.util.*;
public class Wrongsubstraction {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int k=S.nextInt();
		for(int i=1;i<=k;i++) {
			if(String.valueOf(String.valueOf(n).charAt(String.valueOf(n).length()-1)).equals("0")) {
				n=n/10;
			}else {
				n=n-1;
			}
		}
		System.out.println(n);
	}
}
