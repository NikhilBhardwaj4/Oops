package oops;
import java.util.Scanner;
interface name{
    void input();
    void output();
    default void v3(){
        System.out.println("hello mother fucker ");
    }
}

 class interfaces implements name {
    String naam;
    double rollno;
   public void input(){
        Scanner r =new Scanner(System.in);
       System.out.println("enter your name");
       naam = r.nextLine();
       System.out.println("enter your roll no");
       rollno = r.nextDouble();
    }
    public void output(){
        System.out.println(naam+" "+rollno);
    }

     public static void main(String[] args) {
         name r = new interfaces();
         r.input();
         r.output();
         r.v3();
     }
}
