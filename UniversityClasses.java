import java.util.*;
public class UniversityClasses {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int max=0;
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.next();
		}
		for(int i=0;i<7;i++) {
			int temp=0;
			for(int j=0;j<n;j++) {
				if(arr[j].charAt(i)=='1') {
					temp++;
				}
				else {}
			}
			if(temp>max) {
				max=temp;
			}
		}
		System.out.println(max);
	}
}
