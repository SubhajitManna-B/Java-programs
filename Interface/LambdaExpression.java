

@FunctionalInterface    //This annotation use when you have only one abstract  function
interface Computer {
    void show();
}
  
public class LambdaExpression {
    public static void main(String[] args) {
        //<----------------Lambda Expression-------------->
        //You can use this if you have only one abstract function in your interface.
        Computer com = () -> System.out.println("In lambda show.");
        com.show();
    }
}