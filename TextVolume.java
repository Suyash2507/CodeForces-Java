import java.util.*;
public class TextVolume {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();int curr=0;int tem=0;
		while(S.hasNext()) {
			String s=S.next();
			tem=tem+s.length()+1;
			int max=0;
			for(int i=0;i<s.length();i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					max++;
				}
			}
			if(max>curr) {
				curr=max;
			}
			if(tem>=n) {
				break;
			}
		}
		System.out.println(curr);
	}
}
