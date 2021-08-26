import java.util.Scanner;
public class XeniaRingroad {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n =S.nextInt();
		int k =S.nextInt();
		int current=1;
		long sum=0;
		while(k>0) {
			int num =S.nextInt();
			if(num>=current) { 
				sum=sum+num-current;
			}
			else { 
				sum=sum+n-current+num;
			}
			current=num;
			k--;
		}
		System.out.println(sum);
	}
}