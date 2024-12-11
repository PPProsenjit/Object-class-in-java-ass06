class number{
   
    public void multiplicationTabil(int n){
        
         
         for(int i = 1 ; i <= 10 ; i++){
             
             int multi = i * n;
             
             System.out.println(n +" * "+ i +" = "+ multi);
         }
        
    }
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int n = 8;
         
         number obj = new number();
         System.out.println("multiplication Tabil are : \n ");
          obj.multiplicationTabil(n);
         
        
     }
 }