import java.util.*;
public class ElevatororStairs {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int x=S.nextInt();
		int y=S.nextInt();
		int z=S.nextInt();
		int t1=S.nextInt();
		int t2=S.nextInt();
		int t3=S.nextInt();
		int sum1=Math.abs((x-y))*t1;
		int sum2=Math.abs((x-z))*t2;
		sum2=sum2+(3*t3)+Math.abs((x-y))*t2;
		if(sum1>=sum2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
//30590
//27910