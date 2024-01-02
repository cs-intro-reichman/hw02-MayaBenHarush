/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		for(int i = 1; i <= n; i++){
			
			for(int c = 1; ( i % 2 ) != 0 && c <= n; c++){
					System.out.print( "* " );	
			}
			for(int w = 1; ( i % 2 ) != 0 && c <= n; w++){
					System.out.print( " *" );	
			}
			System.out.println();
		}		







	}
}
