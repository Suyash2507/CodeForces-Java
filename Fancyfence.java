import java.util.*;//270A
public class Fancyfence {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t = S.nextInt();
		for(int i=t;i>0;i--){
			int n= S.nextInt();
			int b=180-n;
			if(360 % b==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
