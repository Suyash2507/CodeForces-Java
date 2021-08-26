import java.util.Scanner;//479A
public class expression {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int c=S.nextInt();
		int max=0;
		max=Math.max((a+b+c),Math.max(a*b*c,Math.max((a+b)*c,Math.max(a+(b*c),Math.max((a*b)+c,a*(b+c))))));
		System.out.print(max);
	}
}
