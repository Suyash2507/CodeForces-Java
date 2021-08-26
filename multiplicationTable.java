import java.util.*;//577A
public class multiplicationTable {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int x=S.nextInt();
		int r=0,i;
		for(i=1;i<=n;i++) {
			if(x%i==0 && x/i<=n){
				r++;
			}
		}
		System.out.print(r);
	}
}
