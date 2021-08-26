import java.util.*;//1174A
public class EhabThanos {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int[] ar=new int[2*n];
		for(int i=0;i<2*n;i++) {
			ar[i]=S.nextInt();
		}
		Arrays.sort(ar);
		if(ar[0]!=ar[2*n-1]) {
			for(int j=0;j<2*n;j++) 
				System.out.print(ar[j]+" ");
		}else {
			System.out.println("-1");
		}
	}
}
