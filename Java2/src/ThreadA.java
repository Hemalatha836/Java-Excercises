
public class ThreadA implements Runnable{
	
	Thread t;
	ThreadA(){
		t=new Thread(this);
		t.start();
	}
	
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("ThreadA : " +i);
			
		}
	}

}
