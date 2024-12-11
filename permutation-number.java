class permutation{
   
    public long factorial(int n){
         long fact = 1;
         
        while(n > 0){
            
           fact = fact * n;
           n--;
        }
        return fact;
    }
    
    public long permutationNumber(int n, int r){
        
        return factorial(n) / factorial(n-r);
    }
    
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int n = 20;
         int r = 4;
         
         permutation obj = new permutation();
         
         System.out.println("permutation number is: "+ obj.permutationNumber(n, r));
         
        
     }
 }