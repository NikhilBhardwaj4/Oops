package oops;

public class Exception {
    public static void main(String[] args) {
        int a =10; int b=0;int c;
        try{
            c=a/b;
        }
        catch(Throwable e){
            System.out.println("something went wrong");
        }
        System.out.println("hogya khtm");
    }
}
