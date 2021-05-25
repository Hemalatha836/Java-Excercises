import java.util.Comparator;

public  class GamePlayer implements Comparator<GamePlayer> {
	
	private String name;
	private int age;
	private String game;
	
	public GamePlayer(String name,int age,String game) {
		
		this.name=name;
		this.age=age;
		this.game=game;
	}
	
	public GamePlayer() {
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGame() {
		return game;
	}

		
		
	

	@Override
	public String toString() {
		return name + " " + age + " " + game;
	}

	@Override
	public int compare(GamePlayer o1, GamePlayer o2) {
		// TODO Auto-generated method stub
		
		if(o1.getAge()==o2.getAge()) {
			return 0;
		}
		else if(o1.getAge()<o2.getAge()) {
			return -1;
		}
		else {
			return 0;
		}
	}

	
	
	
	

}
