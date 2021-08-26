import java.util.*;
public class Potions {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		int count=0,sum=0,p=0,neg=0;
		for(int i=0;i<n;i++) {
			int a=S.nextInt();
			if(a<0) {
				l.add(a);
				neg++;
			}
			else {
				count++;
				sum=sum+a;
			}
		}
		Collections.sort(l,Collections.reverseOrder());
		while(p<neg) {
			sum=sum+l.get(p++);
			if(sum>=0) {
				count++;
			}
			else {break;}
		}
		System.out.println(count);
	}
}
