import java.util.*;
public class AndthenPart2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int n=S.nextInt();
			int z=n,k=n-1;
			while(true) {
				z=z & k;
				if(z==0) {
					System.out.println(k);
					break;
				}else if(k!=0) {
					k--;
				}else {
					System.out.println("0");
					break;
				}
			}
			t--;
		}
	}
}
