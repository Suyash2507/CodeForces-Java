import java.util.*;//691A
public class FashionBerland {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int flag=0;
		int n=S.nextInt();
		if(n==1) {
			int m=S.nextInt();
			String res=(m==1)?"YES":"NO";
			System.out.println(res);
		}else {
			while(n!=0) {
				int p=S.nextInt();
				if(p==0) {
					flag++;
				}
				n--;
			}
			String res2=(flag==1)?"YES":"NO";
			System.out.println(res2);
		}
	}
}
