
//use combination equation nCp = n! / r!(n-r)!
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
    
    public void pascalTriangle(int row){
        for(int i = 0 ; i < row ; i++){
             // Print spaces for alignment
            for(int j = 0; j < row - i - 1; j++){
                System.out.print(" ");
            }
            
            //print numbers in the row 
            for(int j = 0 ; j <= i ; j++){
                System.out.print(combinationNumber(i, j )+ " ");
            }
           System.out.println();
        }
        
    }
    
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         
         int r = 5;
         
         combination obj = new combination();
         
         obj.pascalTriangle(r);
         
        
     }
 }