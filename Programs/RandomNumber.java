import java.lang.Math;
import java.util.Random;
import java.util.stream.IntStream;

class RandomNumber{
    public static void main(String[] args) {
        //First method(Using Math.random method)
        System.out.println("The first random number is :"+Math.random());
        System.out.println("The second random number is :"+Math.random());
        int max=8,min=5;
        int randomNum=(int)(Math.random()*(max-min+1)+min); //Gives a number between 5 to 8 {5,6,7,8}
        System.out.println(randomNum);
        // These are just for better unerstand.......
        // double num=Math.random();
        // double a=(num*(max-min+1)+min);
        // int b=(int)a;
        // System.out.println(num);
        // System.out.println(a);
        // System.out.println(b);

        //Second method(Using random class)
        Random random=new Random();
        int num1=random.nextInt(10); //This gives a random number between 0 to 9, but not 10.
        int num2=random.nextInt(20); // Gives number between  0,19
        System.out.println("The first random number is :"+num1);
        System.out.println("The first random number is :"+num2);
        System.out.println(random.ints(11,20)); // It's not work here.
    }
}