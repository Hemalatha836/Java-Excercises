import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<GamePlayer> set=new TreeSet<GamePlayer>();
		GamePlayer p1=new GamePlayer("Virat",32,"Cricketer");
		GamePlayer p2=new GamePlayer("Sunil",36,"Football");
		GamePlayer p3=new GamePlayer("Manpreet",28,"Hockey");
		GamePlayer p4=new GamePlayer("Dhoni",39,"Cricketer");
		GamePlayer p5=new GamePlayer("Sania",34,"Tennis");

		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		
		for(GamePlayer p:set) {
			System.out.println(p.name + " " + p.age + " " + p.game);
			
		}


	}

}
