class palindromeNumber{
    int rev = 0, reminder;
   public int palindrome(int n){
       while(n != 0){
           reminder = n % 10;
           rev = rev*10 + reminder;
           
           n = n / 10;
       }
       return rev;
   }
   
   
}

public class Main
{
	public static void main(String[] args) {
	   
	    int n = 515;
	    
		palindromeNumber obj = new palindromeNumber();
		if(n == obj.palindrome(n))
            System.out.println(n +" is a palindrome number. ");
        
        else
         System.out.println(n +" Is not a palindrome number. ");
		
	}
}