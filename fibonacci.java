class fibonacci{
    public void fibo(int n){
        int count = 0;
        if(n < 1){
            System.out.println("Invalid output please inter the positive integer");
        }
        int tem1 = 1;
        int tem2 = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i > 2){
                count = tem1 + tem2;
                tem2 = tem1;
                tem1 = count;
                System.out.println(count);
            }
            else if(i == 1){
                System.out.println(tem2);
            }
            else{
                System.out.println(tem1);
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    System.out.println("the Series is : ");
		fibonacci obj = new fibonacci();
		obj.fibo(5);
	}
}