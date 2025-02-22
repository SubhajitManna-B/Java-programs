//package Accenture;

public class Question6 {
    public static void main(String[] args) {
        int num1 = 9997;
        int num2 = 5693;
        int r1,r2;
        int tempC = 0, car = 0;
        
        while(num1 != 0 && num2 != 0){
            r1 = num1 % 10;
            r2 = num2 % 10;
            if((r1+r2+tempC) > 9) car++;
            if(r1+r2 > 9) tempC = 1;
            else tempC = 0;
            num1 = num1/10;
            num2 = num2/10;
        }
        System.out.println(car);
    }
}
