Problem-3:  With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5
        5) input a = 5, then output : 1, 3, 5, 7, 9
        6) input a = 6, then output : 1, 3, 5, 7, 9
        .
        .
        7) input a = x, then output : 1, 3, 5, 7, .......
        
#code
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
