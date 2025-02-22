public class Temp2 {

    public static int factRec(int n){
        if(n == 1) return n;
        return factRec(n-1) * n;
    }

    public static int gcdRec(int x, int y){
        if(y == 0) return x;
        return gcdRec(y, x%y);
    }

    public static int lcmRec(){
        
    }




    public static void main(String[] args) {
        //System.out.println(factRec(6));
        System.out.println(gcdRec(5, 6));
    }
}
