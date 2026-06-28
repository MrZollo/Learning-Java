package Shape;
public class NumberTest
{
	//---try four possible cases of "11 divided by 3"
   public static void main( String [] args )
   {
   int aInt, bInt;
   double aDouble, bDouble;
   aInt = 11;
   bInt = 3;
   aDouble = 11.0;
   bDouble = 3.0;
   // case 1
   System.out.println( "aInt vs bInt. / and %" );
   System.out.println( aInt / bInt );
   System.out.println( aInt % bInt );
   // case 2
   System.out.println( "aInt / bDouble. / and %" );
   System.out.println( aInt / bDouble );
   System.out.println( aInt % bDouble );
   // case 3
   System.out.println( "aDouble / bInt. / and %" );
   System.out.println( aDouble / bInt );
   System.out.println( aDouble % bInt );
   // case 4
   System.out.println( "aInt / bInt. / and %" );
   System.out.println( aDouble / bDouble );
   System.out.println( aDouble % bDouble );
   } 
}