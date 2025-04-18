package Looping;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) {
			int num=1;
			for(int j=1; j<=7; j++) {
				if(j>4-i && j<4+i) {
					System.out.print(num);
					if(j<=3) {
						num++;
					}	
					else {
						
						num--;
					}
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
