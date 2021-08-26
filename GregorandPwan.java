import java.util.*;
public class GregorandPwan {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int t=S.nextInt();
		for(int k=0;k<t;k++) {
			int n=S.nextInt();
			String a=S.next();
			String b=S.next();
			int count=0;
			for(int i=0;i<n;i++) {
				if(a.charAt(i)=='1') {
					if(b.charAt(i)=='0') {
						count++;
					}
					else if(i>0 && b.charAt(i-1)=='1') {
						count++;
						b=b.substring(0,i-1)+'0'+b.substring(i);
					}
					else if(i<n && b.charAt(i+1)=='1') {
						count++;
						b=b.substring(0,i)+'0'+b.substring(i+1);
					}
				}
			}
			System.out.println(count);
		}
	}
}
