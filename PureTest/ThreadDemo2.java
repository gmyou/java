class ThreadDemo2 extends Thread
{
    public static void main(String [] args)
    {
        ThreadDemo2 t = new ThreadDemo2(); /* Line 5 */
        t.run();  /* Line 6 */
    }

    public void run()
    {
        for(int i=1; i < 3; ++i)
        {
            System.out.print(i + "..");
        }
    }
}

/* Output
1..2..
*/
