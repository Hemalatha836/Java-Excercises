import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<GamePlayer> set=new TreeSet<GamePlayer>(new GamePlayer());
		set.add(new GamePlayer("Sunil",24,"Cricketer"));
		set.add(new GamePlayer("Rohit",22,"Hockey"));
		set.add(new GamePlayer("Roshan",20,"Football"));
		set.add(new GamePlayer("Roshan",20,"Cricketer"));

		
		
		
		
		for(GamePlayer p:set) {
			System.out.println(p);
			
		}


	}

}
