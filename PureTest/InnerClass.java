class Boo
{
    Boo(String s) { }
    Boo() { }
}
class Bar extends Boo
{
    Bar() { }
    Bar(String s) {super(s);}

    void zoo()
    {
      Boo f = new Bar() {
        // 
      };
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Bar b = new Bar();
        b.zoo();
    }
}
