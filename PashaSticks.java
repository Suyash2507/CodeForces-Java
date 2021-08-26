import java.util.*;//610A
public class PashaSticks {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n= S.nextInt();
		if(n%2!=0) {
			System.out.println("0");
		}else {
			if((n/2)%2!=0) {
				System.out.println(n/4);
			}
			else {
				System.out.println(n/4-1);
			}
		}
	}

}
