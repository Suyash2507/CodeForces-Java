import java.util.*;//1296A
public class OddArraySum{
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int k=S.nextInt();
		while(k>0) {
			int n = S.nextInt();
			int arr[] = new int[n];
			int c1=0;
			int c2=0;
			int sum=0;
			for(int i=0;i<n;i++) {
				arr[i]=S.nextInt();sum=sum+arr[i];
				if(arr[i]%2!=0) {
					c2++;
				}else {
					c1++;
				}
			}
			if(sum%2!=0) {
				System.out.println("YES");
			}
			else
				if(c2>=1 && c1>=1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			k--;
		}
	}
}