import java.util.*;//37A
public class towers {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int ar[]=new int[n];
		int p=0;
		while(n!=0) {
			ar[p++]=S.nextInt();
			n--;
		}
		int max=0,t1,i,j;
		for(i=0;i<ar.length;i++) {
			int t=0;
			for(j=0;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					t=t+1;
				}
			}
			if(t>max) {
				max=t;
			}
		}
		System.out.println(max);
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>(); 
		for (int k=0;k<ar.length;k++) {   
            hashmap.put(ar[k],k);   
        }
		System.out.println(hashmap.size());	
	}
}
