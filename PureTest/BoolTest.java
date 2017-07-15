class BoolTest
{
  public static void foo( boolean a, boolean b)
  {
      if( a )
      {
          System.out.println("A"); /* Line 5 */
      }
      else if(a && b) /* Line 7 */
      {
          System.out.println( "A && B");
      }
      else /* Line 11 */
      {
          if ( !b )
          {
              System.out.println( "notB") ;
          }
          else
          {
              System.out.println( "ELSE" ) ;
          }
      }
  }

  public static void main(String[] args) {
    System.out.println( "a:true, b:true" ) ;
    foo(true, true);
    System.out.println( "a:true, b:false" ) ;
    foo(true, false);
    System.out.println( "a:false, b:true" ) ;
    foo(false, true);
    System.out.println( "a:false, b:false" ) ;
    foo(false, false);
  }
}
/* Output
a:true, b:true
A
a:true, b:false
A
a:false, b:true
ELSE
a:false, b:false
notB
*/
