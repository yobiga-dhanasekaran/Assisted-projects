package exception_handling;

public class exp_handling {
    	public static void main(String[] args) {
    		int d =0;
    		int n=56;
    		try {
    			int div = n/d;
    			System.out.println("this line will not be executed");
    		}
    		catch ( ArithmeticException e) {
    			System.out.println(" in the catch block due to exception =" + e);
    		}
    		System.out.println("End of main");
    	}
    	
}
