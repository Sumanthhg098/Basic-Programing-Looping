import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("enter an input values : ");
		int count, n=0;
		int m = abc.nextInt();
		n=m;
		if(m%2==0) {
			n=(m-1);
		}
		for(int i=1;i<=n;i++) {
		    count = i+(i-1);	
		System.out.print(count+ " ");
	}

	}

}
