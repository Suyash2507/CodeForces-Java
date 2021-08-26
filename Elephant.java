import java.util.*;
public class Elephant {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int x=S.nextInt();
		if(x<=5)
			System.out.println(1);
		else
			if(x%5==0)
				System.out.println((x/5));
			else
				System.out.println((x/5)+1);
	}
}
