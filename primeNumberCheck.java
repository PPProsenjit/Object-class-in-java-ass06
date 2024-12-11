class primeNumber{
    public static boolean prime (int n){
        if(n == 1){
            return false;
        }
        for(int i = 2 ; i < n/2 ; i++){
            
            if(n % i == 0){
               return false;
            }
            
        }
        
        return true;
        
    }
}

public class Main
{
	public static void main(String[] args) {
	   
	    int n = 1;
	    
		primeNumber obj = new primeNumber();
		if(obj.prime(n))
            System.out.println(n +" is a prime number");
        
        else
         System.out.println(n +" Is not a prime number;");
		
	}
}