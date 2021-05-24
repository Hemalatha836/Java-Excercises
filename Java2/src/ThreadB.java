
public class ThreadB extends Thread{
	
	Thread t;
	ThreadB(){
		t=new Thread(this);
		t.start();
	}
	
	public void run() {
		for(int j=5;j<10;j++) {
			System.out.println("ThreadB : " +j);
			
		}
	}

}
