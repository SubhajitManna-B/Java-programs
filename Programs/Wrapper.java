public class Wrapper {
    public static void main(String arg []){
        Integer i1=Integer.valueOf("100011",2);  
        Double d1=Double.valueOf("3.14");
        int a=Integer.parseInt("123");
        double d=Double.parseDouble("3.14");
        int c=i1.intValue();
        System.out.println("The 1st result is : "+i1);
        System.out.println("The 2nd result is : "+d1);
        System.out.println("The 3rd result is : "+a);
        System.out.println("The 4th result is : "+d);
        System.out.println("The 5th result is : "+c);
    }
}
