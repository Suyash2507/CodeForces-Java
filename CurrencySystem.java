import java.util.*;//560A
public class CurrencySystem {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int p=0;
		int n=S.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[p]=S.nextInt();
			p++;
		}
		int flag=0;
		for(Integer j:ar) {
			if(j==1) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("-1");
		}else {
			System.out.println("1");
		}
	}
}
