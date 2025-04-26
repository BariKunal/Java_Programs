package Class_Object;
import java.util.*;

class Table{
	int n;
	void setValue(int n) {
		this.n=n;
	}
	void showTable() {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+i*n);
		}
	}
}

public class TableOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		Table t = new Table();
		t.setValue(num);
		t.showTable();
	}

}
