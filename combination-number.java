class combination{
   
    public long factorial(int n){
         long fact = 1;
         
        while(n > 0){
            
           fact = fact * n;
           n--;
        }
        return fact;
    }
    
    public long combinationNumber(int n, int r){
        
        long remain = factorial(r) * factorial(n-r); 
        
        return factorial(n) / remain ;
    }
    
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int n = 20;
         int r = 4;
         
         combination obj = new combination();
         
         System.out.println("combination number is: "+ obj.combinationNumber(n, r));
         
        
     }
 }