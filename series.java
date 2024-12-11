class series{
   
    public long seriesNumber(int n){
        
         int i = 1;
         int sum = 0;
         // series 1 + 2 + 3 + ........+ n
         //using loop check one by one and add 
         while(i <= n){
            sum = sum + i;
            i++;
        }
       // condition of series 1 + 2 + 3 + ........+ n
       // sum = n * (n+1) /2;
        
        
        return sum;
        
    }
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int n = 20;
         
         series obj = new series();
         
         System.out.println(n + " Sum of the series is : "+ obj.seriesNumber(n));
         
        
     }
 }