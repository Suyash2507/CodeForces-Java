import java.util.*;//620B
public class GrandfatherCalci {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int[] ar= {6,2,5,5,4,5,6,3,7,6};
		int sum=0;
		for(int i=a;i<=b;i++) {
			for(int j=String.valueOf(i).length()-1;j>=0;j--) {
				sum=sum+ar[Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)))];
			}
		}
		System.out.println(sum);
	}
}
