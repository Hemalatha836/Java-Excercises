
public class GamePlayer implements Comparable<GamePlayer> {
	
	String name;
	int age;
	String game;
	
	public GamePlayer(String name,int age,String game) {
		
		this.name=name;
		this.age=age;
		this.game=game;
	}
	
	
	
	@Override
	public int compareTo(GamePlayer p) {
		// TODO Auto-generated method stub
		
		if(age>p.age) {
			return 1;
		}
		else if(age<p.age) {
			return -1;
		}
		else {
		    return 0;
		}
	}
	

}
