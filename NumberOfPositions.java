import java.util.*;//124A
public class NumberOfPositions {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int a=S.nextInt();
		int b=S.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n-i<=b && a<=i-1){
				count++;
			}
		}
		System.out.println(count);
	}
}
