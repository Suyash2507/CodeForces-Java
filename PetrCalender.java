import java.util.*;
public class PetrCalender {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int m=S.nextInt();
		int d=S.nextInt();int n=0;
		int curr=d,col=1;
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			n=31;
			break;
		case 2:
			n=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			n=30;
			break;
		}
		for(int i=2;i<=n;i++) {
			curr=curr+1;
			if(curr>7) {
				col++;
				curr=curr-7;
			}
		}
		System.out.println(col);
	}
}
