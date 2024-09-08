class temp{
    public static void main(String[] args) {
        int i, j, print = 1;
        for(i=1 ; i<=5; i++){
            for(j=1; j<=1; j++){
                System.out.print(print+" ");
            }
            System.out.println();
        }
        String str = new String("Subha");
        String str2 = new String("Subha");
        //String str = "Subha";
        //String str2 = "Subha";
        System.out.println(str.equals(str2));
    }
}