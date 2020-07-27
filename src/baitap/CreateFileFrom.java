package baitap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileFrom {
    public static void main(String[] args) {
        try {
            FileWriter fileFrom=new FileWriter("from.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileFrom);
            bufferedWriter.write("Hello Word\nHello C0520K1");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
