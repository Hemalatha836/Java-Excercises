import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOrder {

	private static List Order;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
			ArrayList<String> order=new ArrayList<>();
		 	Order o1 = new Order(1,"Car","Hema");
	        Order o2 = new Order(2,"Train","Chinnu");
	        Order o3 = new Order(3,"Bus","Madhu");

	        
	        try {
	            FileOutputStream fos = new FileOutputStream(new File("order.txt"));
	            ObjectOutputStream oos = new ObjectOutputStream(fos);

	            // Write objects to file
	            oos.writeObject(o1);
	            oos.writeObject(o2);
	            oos.writeObject(o3);

	            
	            oos.close();
	            fos.close();

	            FileInputStream fis = new FileInputStream(new File("order.txt"));
	            ObjectInputStream ois = new ObjectInputStream(fis);

	            // Read objects
	            Order order1 = (Order) ois.readObject();
	            Order order2 = (Order) ois.readObject();
	            Order order3 = (Order) ois.readObject();

	            System.out.println(order1.toString());
	            System.out.println(order2.toString());
	            System.out.println(order3.toString());


	            ois.close();
	            fis.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found");
	        } catch (IOException e) {
	            System.out.println("Error initializing stream");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
