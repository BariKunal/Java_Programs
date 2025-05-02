package May_Test_Answers;

public class TestPattern {
	public static void main(String x[])
	{
		for(int i=0; i<=4; i++)
		{
			int num=1;
			for(int j=1; j<=7; j++)
			{
				if(j>4-i &&  j<4+i)
				{
					System.out.print(num);
					if(j<=3){
						num++;
					}
					else{
						num--;
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
