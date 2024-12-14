package oops;

import java.io.*;

public class Filewrite {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("C:\\Users\\91900\\onedrive\\desktop\\C.txt");
            try{
                file.write("data agyaaa");
            }catch(Throwable e){
                System.out.println(e);
            }
            finally{
                file.close();
            }
        } catch( Throwable e){
            System.out.println(e);
        }

    }
}
