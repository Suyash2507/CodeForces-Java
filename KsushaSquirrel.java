import java.util.*;
public class KsushaSquirrel {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int k=S.nextInt();
		char[] arr=S.next().toCharArray();
		int p=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			if(arr[i]=='#') {
				sb.append(arr[i]);
			}
			else {
				if(sb.length()>=k) {
					p=1;
					break;
				}
			}
		}
		if(p==1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
