import java.util.concurrent.Callable;

public class Multiplication implements Callable<Integer> {
	
	private int i;
	private int j;


	
	
	public Multiplication(int i, int j) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.j=j;
	}




	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return i*j;
	}

}
