import java.util.*;//1312B
public class LuxiriousHouses {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n= S.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr[i]=S.nextInt();
			l1.add(arr[i]);
		}
		int[] res=new int[n];
		for(int j=0;j<n;j++) {
			if(j!=n-1) {
				int y=0;
				int z=(1+Collections.max(l1.subList(j+1,l1.size()))-arr[j]);
				if(z<0) {
					y=0;
				}else {
					y=(1+Collections.max(l1.subList(j+1,l1.size()))-arr[j]);
				}
				res[j]=(res[j]!=Collections.max(l1.subList(j+1,l1.size())))?y:0;
			}else {
				res[j]=0;
			}
		}
		for(int m=0;m<n;m++) {
			System.out.print(res[m]+" ");
		}
	}
}
