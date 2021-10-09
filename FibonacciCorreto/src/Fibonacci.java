import java.util.Scanner;

public class Fibonacci {
	   public static int fibo(int n) {
	    	
	    	if(n==1)
	    		return(0);
	    	if (n==2)
	    		return(1);
	    	int f=0,f1=0,f2=1;
	    	
	    		f=f1+f2;
	    		f1=f2;
	    		f2=f;
	    	
	        return(f);
	    }

	    public static void main(String[] args) {
	    	 Scanner scan = new Scanner(System.in);			   
		     System.out.print("Informe um numero: ");
		      int n1=scan.nextInt();

		      if(n1<=0) {
		    	  System.out.println("Erro! Numero digitado e menor que 0.");
		      }
		      else {
		for (int i = 0; i < n1; i++) {
	            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
	        }
		      }
	    }
}
