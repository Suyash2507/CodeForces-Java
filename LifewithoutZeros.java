import java.util.*;//75A
public class LifewithoutZeros {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int c=a+b;
		String t1=String.valueOf(a).replaceAll("0","");
		String t2=String.valueOf(b).replaceAll("0","");
		String t3=String.valueOf(c).replaceAll("0","");
		if(Integer.parseInt(t3)==(Integer.parseInt(t1)+Integer.parseInt(t2))) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
