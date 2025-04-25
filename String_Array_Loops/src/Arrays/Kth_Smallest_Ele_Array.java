//4. Find the Kth Smallest Element in an Array
//Description: Find the kth smallest element in an unsorted array.
//
//Input: [12, 3, 5, 7, 19], k = 2
//
//Output: 5


package Arrays;
import java.util.*;
public class Kth_Smallest_Ele_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Array :");
		int size = sc.nextInt();
		
		int a [] = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array :");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter The Kth Element :");
		int k = sc.nextInt();
		int count=0;
		
		for(int i=0; i<size; i++) {
			if(a[i]!=a[i+1]) {
				count++;
				if(count==k) {
					System.out.println("Kth Smallest Element Is :"+a[i]);
					break;
				}
			}
		}
	}

}
