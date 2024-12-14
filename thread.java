package oops;
class T extends Thread {
    public void run(){
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        T t1 =new T();
        T t2 =new T();
        T t3 =new T();

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t3.start();

       try{
           t3.join();

       } catch(Throwable i){
           System.out.println(i);
       }
        t1.start();
        t2.start();


        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }


}
