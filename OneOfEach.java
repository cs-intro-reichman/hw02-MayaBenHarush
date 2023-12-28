
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean g == false ;
		boolean b == false;

		for (int i = 0; g == false || b == false; i++) {
		 	if ( Math.random() < 0.5 ){

		 		g == true;
		 		System.out.println( "g ");
		 	}
		 	else {
		 		b == true;
		 		System.out.println( "b ");


		 	}		 		
		 }

		System.out.println( " You made it... and you now have " + i + "children.");



	}
}
