package Arrays;
import java.util.*;
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter The "+size+" Array Elements :");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int Secmax=0;
		
		for(int i=0; i<size; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println("Highest Element Is :"+max);
		for(int i=0; i<size; i++) {
			if(max>arr[i] && Secmax!=max) {
				Secmax=arr[i];
			}
		}
		System.out.println("Second Highest Element Is :"+Secmax);
	}

}
