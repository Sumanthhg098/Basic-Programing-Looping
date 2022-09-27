import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("enter an input values : ");
		int count;
		int m = abc.nextInt();
		for(int i=1;i<=m;i++) {
			    count = i+(i-1);	
			System.out.print(count+ " ");
		}
	}

}
