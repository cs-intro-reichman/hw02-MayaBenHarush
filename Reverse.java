public class Reverse {

    public static void main(String[] args) {

        String str = args[0];
        int a = str.length()-1;
        String r = "";
        while (a >= 0){
            r = r + str.charAt(a) ;
            a-- ;
        }
        System.out.println( r );
        System.out.println( "The middle character is " + str.charAt( (str.length()-1) / 2) );
        

    



        




    }
}    