package oops;

class shape{
    void show (){
        System.out.println("shape");
    }
}
class square extends shape{
    @Override
    void show(){
        System.out.println("square");
    }
}

 class overriding {
     public static void main(String[] args) {
         shape r =new square();
         r.show();
     }
}
