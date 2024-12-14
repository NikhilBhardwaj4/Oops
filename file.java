package oops;
import java.io.*;

public class file {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\91900\\onedrive\\desktop\\C.txt");
        try{
            if(f.createNewFile()){
                System.out.println("file created successfully ");
            } else System.out.println("file already exist");
        }
        catch(Throwable e){
            System.out.println(e);

        }
    }

}
