package baitap;

import java.io.File;
import java.io.IOException;

public class CreateFileTo {
    public static void main(String[] args) {
        try {
            File fileTo=new File("to.txt");
            fileTo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
