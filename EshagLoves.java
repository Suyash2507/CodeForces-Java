import java.util.*;
public class EshagLoves {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int n=S.nextInt();int min=999999999;
			HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=S.nextInt();
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			int curr_maxf=0,m=1000000000;
			for(int j=0;j<n;j++) {
				if(arr[j]<m) {
					m=arr[j];
				}
				if(hm.containsKey(arr[j])) {
					hm.put(arr[j],hm.get(arr[j])+1);
				}else {
					hm.put(arr[j],1);
				}
				
			}
			System.out.println(n-hm.get(m));
			t--;
		}
	}
}
