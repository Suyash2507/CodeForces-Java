import java.util.*;
public class ILoveuser {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();int max=0;int min=0,c=0;
		if(n==1) {
			System.out.println(0);
		}else {
			max=min=S.nextInt();
			for(int i=0;i<n-1;i++) {
				int k=S.nextInt();
				if(k<min) {
					min=k;
					c++;
				}else if(k>max) {
					max=k;
					c++;
				}
			}
			System.out.println(c);
		}
			
				
				
	}
}
