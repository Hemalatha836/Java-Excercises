
public class ThreadC extends Thread{
	
	Thread t;
	ThreadC(){
		t=new Thread(this);
		t.start();
	}
	
	public void run() {
		for(int k=10;k<15;k++) {
			System.out.println("ThreadC : " +k);
			
		}
		
	}

}
