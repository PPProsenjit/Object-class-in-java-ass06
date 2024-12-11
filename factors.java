class factors{
   
    public void factorsNumber(int n){
        System.out.println(" Fators of " + n + " are: \n");
         int i = 1;
        while(i <= n){
            if(n % i == 0){
                System.out.println(i);
            }
            
            i++;
        }
        
    }
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int n = 20;
         
         factors obj = new factors();
         
         obj.factorsNumber(n);
         
        
     }
 }