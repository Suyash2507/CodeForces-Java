import java.math.BigInteger;
import java.util.*;
public class Tprimes {
	public static boolean[] num=new boolean[1000001];
	public static boolean check(long d){
		double sq = Math.pow((double)d,0.5);
		if(Math.floor(sq) != sq) 
			return false;
		if(num[(int)sq]) 
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		num[1]=true;
		for(int i = 2; i <= 1000; ++i){
			  if(num[i] == false){
				  for(int j = 2; i*j <= 1000000; ++j){
					  num[i*j] = true;
				  }
			  }
		 }
		for(int i=0;i<n;i++) {
			long s=S.nextLong();
			if(s==1) {
				System.out.println("NO");
			}else {
				if(check(s)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
}
