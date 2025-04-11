package Arrays;
import java.util.*;
public class FrequencyOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter the "+size+" Elements in Array");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The Element you want to count frequency :");
		int search = sc.nextInt();
		
		int count=0;
		for(int i=0; i<size; i++) {
			if(search==a[i]) {
				count++;
			}
		}
		System.out.println("Frequency of "+search+" Is :"+count);
	}

}
