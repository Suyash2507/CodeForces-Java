import java.util.*;
public class BearBigbother {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		int z=0;
		while(true) {
			z++;
			a=a*3;
			b=b*2;
			if(a>b) {
				break;
			}
		}
		System.out.println(z);
	}
}
