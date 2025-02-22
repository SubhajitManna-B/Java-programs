public class Tempo {

    public static void fakeFunction(Integer no){
        no = no + 10;
        System.out.println(no);
    }
    public static void main(String[] args) {
        Integer no = 5;
        fakeFunction(no);
        System.out.println(no);
    }
}
