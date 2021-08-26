import java.util.*;//1312B
public class LuxiriousHouses2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n= S.nextInt();
		int[] arr=new int[n];
		int[] res=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
		}
		int max=0;int k=0;
		for(int j=n-1;j>=0;j--) {
			if(arr[j]>max) {
				res[k]=0;
				max=arr[j];
			}else if(arr[j]==max){
				res[k]=1;
			}	
			else {
				res[k]=max-arr[j]+1;
			}
			k++;
		}
		for(int j=n-1;j>=0;j--) {
			System.out.print(res[j]+" ");
		}
	}
}