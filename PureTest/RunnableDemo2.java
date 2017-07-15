class RunnableDemo2 implements Runnable
{
    int x = 0, y = 0;
    int addX() {x++; return x;}
    int addY() {y++; return y;}
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.println(addX() + " " + addY());
    }
    public static void main(String args[])
    {
        RunnableDemo2 run1 = new RunnableDemo2();
        RunnableDemo2 run2 = new RunnableDemo2();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}
/* Output
1 1
1 1
2 2
2 2
3 3
3 3
4 4
5 5
6 6
7 7
8 8
9 9
10 10
4 4
5 5
6 6
7 7
8 8
9 9
10 10
*/
