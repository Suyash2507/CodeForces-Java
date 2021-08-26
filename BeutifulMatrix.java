import java.util.*;
public class BeutifulMatrix {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);int m=0,n=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(S.nextInt()==1) {
					m=i+1;n=j+1;
					break;
				}
			}
		}
		System.out.println(Math.abs(3-m)+Math.abs(3-n));
	}
}
