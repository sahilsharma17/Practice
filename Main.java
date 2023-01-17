interface i{
    void A();
    void B();
    void C();
}
abstract class Adapter implements i{
    public void A(){
        System.out.println("A");
    }
    public void B(){}
    
}
class Test extends Adapter{
    public void C(){}
}
public class Main
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.A();
    }
}