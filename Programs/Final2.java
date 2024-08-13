class a //final can not inherit
{
    int a=5,b=7;
     void disp() //final method can not overriden
    {
       System.out.println("This is final method");
       System.out.println("a = "+a);
       System.out.println("b = "+b);
    }
}
class b extends a{
    int a=4,b=6;
    void disp()
    {
        System.out.println("This is extends method");
        System.out.println("a = "+a);
       System.out.println("b = "+b);
    }
}

class Final2
{
 public static void main(String args [])
 {
    b obj=new b();
    obj.disp();
 }
}