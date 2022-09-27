Problem-2:  With a single integer as the input, generate the following until a = x [series of numbers as shown in the below examples]

    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1, 3
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5, 7
        .
        .
        5) input a = x, then output : 1, 3, 5, 7, .......
#code
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
