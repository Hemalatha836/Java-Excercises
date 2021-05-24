import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeNumber palindrome= new PalindromeNumber();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int PolindromeNum=palindrome.PolindromeNum(number);
       
        System.out.println("Nearest Palindrome is :"+PolindromeNum);
    }
 
    public int PolindromeNum(int number){

        if(number>10){
                String rev = "";
                String num="" +number ;
                int nearPolindrome=0;
                int length=num.length();          
                String HalfNum=null;
                int Num =length/2;
                String firstHalf=num.substring(0,Num);
                    if(length%2==0){
                        HalfNum=num.substring(Num);
                    }else{
                        HalfNum=num.substring(Num+1);
                    }              
                    for(int i=firstHalf.length()-1;i>=0;i--){
                        rev = rev + firstHalf.charAt(i);                

                    }
                    int anotherHalfNumber=Integer.parseInt(HalfNum);
                    int reverseFirstHalfNumber=Integer.parseInt(rev);
                    int adjNumber = anotherHalfNumber-reverseFirstHalfNumber;
                    nearPolindrome = number-adjNumber;
                    return nearPolindrome;
        }
         return number;

	}

}
