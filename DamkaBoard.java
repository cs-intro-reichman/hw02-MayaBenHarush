/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		for(int i = 0; i < n; i++){
			if(i % 2 == 0 || i == 0){
				for(int c = 0; c < n; c++){

					System.out.print( "* " );	  
			    }
			}
			else {
				for(int c = 0; c < n; c++){
					System.out.print( " *" );
				}
			}
			System.out.println();

		}		


	}
}
