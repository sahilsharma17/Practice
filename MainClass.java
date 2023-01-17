abstract class A
{
    int i = 111, j = 222;
     
    abstract void methodOne();
     
    abstract void methodTwo();
}
 
abstract class B extends A
{
    @Override
    void methodOne()
    {
        System.out.println(i);
         
        System.out.println(j);
         
        i = ++i;
         
        j = --j;
    }
}
 
class C extends B
{
    @Override
    void methodTwo()
    {
        System.out.println(i);
         
        System.out.println(j);
         
        i = i++;
         
        j = j--;    
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
         
        c.methodOne();
         
        c.methodTwo();
         
        System.out.println(c.i);
         
        System.out.println(c.j);
    }
}