import java.util.*;
public class BallGame {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int curr=1;
		for(int i=1;i<n;i++) {
			curr=curr+i;
			if(curr>n) {
				curr=curr-n;
			}
			System.out.println(curr);
		}
	}
}
