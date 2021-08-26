import java.util.*;//1399A
public class RemoveSmallest {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int k=S.nextInt();
		while(k>0) {
			int n =S.nextInt();
			int flag=1;
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=S.nextInt();
			}
			Arrays.sort(arr);
			for(int j=0;j<n-1;j++) {
				if(Math.abs(arr[j]-arr[j+1])>1) {
					flag=0;
					break;
				}
			}
			if(flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");
			k--;
		}
	}
}