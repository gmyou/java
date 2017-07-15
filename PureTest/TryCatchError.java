public class TryCatchError
{
    public static void main(String [] args)
    {
        try
        {
            badMethod();
            System.out.println("A");
        }
        catch (Exception ex)
        {
            System.out.println("B");
        }
        finally
        {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod()
    {
        throw new Error(); /* Line 22 */
    }
}

/* Output
C
Exception in thread "main" java.lang.Error
	at TryCatchError.badMethod(TryCatchError.java:22)
	at TryCatchError.main(TryCatchError.java:7)
*/
