/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {

		int a = Integer.parseInt(args[0]);
		int sum = 1;
		String str = a + " = 1 "; 

		for(int i= 2; i < a; i++){
           if(a % i == 0){
           	sum = sum + i;
           	str = str + "+ " + i;
  
           }

        }

        if( sum == a )
        	System.out.print( a + " is a perfect number since" + str );
        else
        	System.out.print( a + " is not a perfect number "); 


	}
}
