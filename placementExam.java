import java.util.*;
public class placementExam {
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void printGraph(ArrayList<ArrayList<Integer> > adj)
	{
		int currMax=0;
		for (int i = 0; i < adj.size(); i++) {
			int currMax1=0;
			for (int j = 0; j < adj.get(i).size(); j++) {
					currMax1++;
			}
			if(currMax1>currMax) {
				currMax=currMax1;
			}
		}
		System.out.println(currMax);
	}
	public static int findGCD(int a, int b)  {  
		while(b != 0)
		{  
			if(a > b)  {  
				a = a - b;  
			}else  {  
				b = b - a;  
			}  
		}  
		return a;  
	}  
	public static void main(String[] args) {
		placementExam obj=new placementExam();
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int x=S.nextInt();
		int k=S.nextInt();
		int gcd=0;
		boolean c1=false,c2=false,c3=false;
		ArrayList<ArrayList<Integer> > adj= new ArrayList<ArrayList<Integer>>(n);
		for (int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		int[] arr=new int[n];
		for(int m=0;m<n;m++) {
			arr[m]=S.nextInt();
		}
		for(int j=0;j<n;j++) {
			for(int q=0;q<n;q++) {
				c1=false;c2=false;c3=false;
				if(j!=q) {
					if(arr[j]<arr[q]) {
						c1=true;
					}
					if(Math.abs(arr[j]-arr[q])>=k) {
						c2=true;
					}
					gcd = obj.findGCD(arr[j],arr[q]);
					if(gcd>=x) {
						c2=true;
					}
					if(c1 && c2 && c3) {
						obj.addEdge(adj,arr[j],arr[q]);
					}
				}
			}
		}
		obj.printGraph(adj);
	}
}
