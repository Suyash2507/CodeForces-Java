import java.util.Scanner;
public class Potions2 {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();int c=0;
		int[] ar=new int[n];int sum=0;
		for(int i=0;i<n;i++) {
			ar[i]=S.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(ar[i]>=0) {
				sum=sum+ar[i];
				c++;
			}
			else {
				int s=0;
				for(int j=i;j<n;j++) {
					s=s+ar[j];
				}
				if(sum+s>=0) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
