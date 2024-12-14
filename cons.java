package oops;

//copy cons
class a{
    int a;String b;
    a(){
        a=10;
        b="Harsh";
        System.out.println(a+" "+b);
    }
    a( a abc){
        a= abc.a;
        b= abc.b;
        System.out.println(a+" "+b);
    }
}

public class cons {
    public static void main(String[] args) {
        a r = new a();
        a r2 = new a();
    }
}
