class number{
   
    public void swap(int a, int b){
        
        a = a + b;
        b = a - b;
        a = a - b;
         
        System.out.println("a = " + a + "\nb = "+b);
    }
    
 }
 
 public class Main
 {
     public static void main(String[] args) {
        
         int a = 8;
         int b = 6;
         
         number obj = new number();
         System.out.println("a = "+ a +"\nb = "+ b);
         System.out.println("after swap");
          obj.swap(a, b);
         
        
     }
 }