import java.util.*;//230A
public class Dragons {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int s=S.nextInt();
		int n=S.nextInt();
		int sum=s,flag=0;
		int[] base=new int[n];
		int[] bonus=new int[n];
		for(int i=0;i<n;i++) {
			base[i]=S.nextInt();
			bonus[i]=S.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(sum>base[j]) {
				sum=sum+bonus[j];
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
