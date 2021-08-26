import java.util.*;//742A
public class hardexam {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		if(n==0) {
			System.out.println("1");
		}
		else{
			int m=n%4;
			switch(m) {
			case 3:
				System.out.println('2');
				break;
			case 2:
				System.out.println('4');
				break;
			case 1:
				System.out.println('8');
				break;
			case 0:
				System.out.println('6');
				break;
			}
		}			
	}
}
