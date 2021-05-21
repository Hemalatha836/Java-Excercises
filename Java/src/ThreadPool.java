import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		// TODO Auto-generated method stub
		
		int n =0;
		int ans =1;
		int k=5;
		 
		   for(int i=0;i<k;i++) {
		    System.out.println("Calculate Factorial Of a Number:");
		    Scanner sc = new Scanner(new InputStreamReader(System.in));
		    String input = sc.nextLine();
		   if(input!=null)
		           n = Integer.valueOf(input);
		   if(n==0 || n==1){
		           ans = 1;
		   }
		   calcuateFactorial(n, ans);  

		}
		 
		}

		private static void calcuateFactorial(int n, int ans) throws InterruptedException, ExecutionException {
		   ExecutorService executor = Executors.newFixedThreadPool(5);
		   List<Future<Integer>> task = new ArrayList<Future<Integer>>();
		   for(int i =1;i<=n ;i++){
		       int j = i+1;
		       Future<Integer> taskRes;
		       if(j>i)
		           taskRes = executor.submit(new Multiplication(i, 1));
		       else
		            taskRes=    executor.submit(new Multiplication(i, j));
		       task.add(taskRes);

		   }

		   for (Future<Integer> future :task){
		       ans = ans* future.get();
		   }
		   executor.shutdown();
		   System.out.println("Factorial is "+ ans);
		}

}
