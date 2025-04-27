//Q6. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.

package Class_Object;

class Player{
	private int id;
	private String name;
	private int run;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	void Display() {
		System.out.println("Player ID Is : "+getId());
		System.out.println("Player Name Is : "+getName());
		System.out.println("Player ID Is : "+getRun());
	}
}
public class Player_POJO_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p = new Player();
		p.setId(1);
		p.setName("Kunal");
		p.setRun(100);
		p.Display();
	}

}
