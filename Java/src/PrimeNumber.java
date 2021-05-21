import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		sc.close();
		try {
			if(n<0) {
				throw new Exception("Number is negative");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(n + " Prime number " );
		}
		else {
			System.out.println(n + " not a prime number ");
		}
		try {
			if(n>100) {
				throw new Exception("Number is too large");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
