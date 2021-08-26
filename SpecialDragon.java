import java.util.*;//230A
public class SpecialDragon {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int s=S.nextInt();
		int n=S.nextInt();
		int sum=s,flag=0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int[] base=new int[n];
		int[] bonus=new int[n];
		for(int i=0;i<n;i++) {
			base[i]=S.nextInt();
			list1.add(base[i]);
			bonus[i]=S.nextInt();
			list2.add(bonus[i]);
		}
		int min=0,index=0;
		while(list2.size()!=0) {
			min = Collections.min(list1);
			index = list1.indexOf(min);
			if(s>min) {
				s=s+list2.get(index);
				list1.remove(index);
				list2.remove(index);
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
