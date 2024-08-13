import java.util.Scanner;

class ChkPrime {
    int num;

    ChkPrime(int num) {
        this.num = num;
    }

    void check() {
        int i, c = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                c += 1;
            }
        }
        if (c == 2)
            System.out.println("The number " + num + " is prime.");
        else
            System.out.println("The number " + num + " is not prime.");
    }
}

class PrimeChk {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for check prime or not : ");
        int num = obj.nextInt();
        ChkPrime obj1 = new ChkPrime(num); 
        obj1.check();
    }
}
