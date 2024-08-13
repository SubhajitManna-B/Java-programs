class ShowException extends Exception{
    public String toString(){
        return "Not divided by zero.";
    }
    public String getMessage(){
        return "Not divided by zero.";
    }
}

public class Throw {

    static int devide(int a,int b) throws ShowException{
        if(b == 0){
            throw new ShowException();
        }
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(devide(9, 0));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
