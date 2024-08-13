public class BreakStatement{
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("out of loop");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                if(j==5){
                    break;
                }
                System.out.println(i+" * "+j+ "=" +i*j);
            }
            System.out.println("One round complete");
        }
        System.out.println("Out of outer loop");
    }
}