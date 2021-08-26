import java.util.*;
public class ForgottenEpisode {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int j=0;j<n-1;j++) {
			int a=S.nextInt();
			l1.add(a);
		}
		for(int i=1;i<=n;i++) {
			if(!l1.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
