package Arrays;
import java.util.*;
public class Common_Ele_Two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int []a = new int[size];
		int []b = new int[size];
		System.out.println("Enter the 1st Array Elements :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the 2nd Array Elements :");
		for(int i=0; i<size; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("Common Elements In Two Arrays :");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(a[i]==b[j]) {
					System.out.print(+a[i]+" ");
				}
			}
			
		}
	}

}
