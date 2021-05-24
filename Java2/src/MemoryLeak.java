import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class MemoryLeak {
	
	private Map<String,String> map=new HashMap<String,String>();
	
	private void initMem() {
		map.put("John","Engineer");
		map.put("Madhu","Doctor");
		map.put("Rob","Business man");
	}
	
	public Map<String,String> getMem(){
		return map;
		
	}
	
	public void forDisplay() {
		for(String key:map.keySet()) {
			String value=map.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryLeak leak=new MemoryLeak();
		leak.initMem();
		leak.forDisplay();
		Vector v1=new Vector(123568);
		Vector v2=new Vector(1234456721);
		System.out.println("No memory leak");
		
	}

}
