import java.util.*;
public class PhoneCode {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int count=0,t=0;
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.next();
		}
		for(int j=0;j<arr[0].length();j++) {
			char a=arr[0].charAt(j);
			for(int k=0;k<n;k++) {
				if(arr[k].charAt(j)!=a) {
					t=1;
					break;
				}
			}
			if(t==1) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}
