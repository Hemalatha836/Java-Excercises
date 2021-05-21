import java.util.concurrent.Callable;

public class Factthraed implements Callable<Integer>{
	
	int i,fact=1,num=1;
	public void Factthread(int num) {
		this.num=num;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	

}
