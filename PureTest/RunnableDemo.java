class RunnableDemo implements Runnable
{
    int x, y;
    public void run()
    {
        for(int i = 0; i < 1000; i++)
            synchronized(this)
            {
                x = 12;
                y = 12;
            }
        System.out.print(x + " " + y + " ");
    }
    public static void main(String args[])
    {
        RunnableDemo run = new RunnableDemo();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }
}

/* Output
12 12 12 12
*/
