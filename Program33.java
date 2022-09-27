import java.util.*;

public class Program33 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the size of dictionary :");
		int n = abc.nextInt();
		int arr1[]=new int[n];
		int o = abc.nextInt();
		int arr2[]=new int[o];
		
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println("enter the values for 1st arr : "+(i+1));
			arr1[i]=abc.nextInt();		
			}
		for(int j=0;j<=arr2.length-1;j++) {
			System.out.println("enter the values for 2nd arr : "+(j+1));
			arr2[j]=abc.nextInt();		
			}
		int count = 0;
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr2[j]%arr1[i]==0) {
					count++;
				}
			}
			System.out.print(arr1[i]+":"+count+" ");
			count=0;
		}
	}

}
