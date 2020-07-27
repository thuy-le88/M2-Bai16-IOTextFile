package thuchanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExample(String filePath) {
        try {
            //đọc file theo đường dẫn
            File file=new File(filePath);
            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            //HIển thị tổng:
            System.out.println("Total = "+sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("File ko tồn tại hoặc nội dung có lỗi.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn: ");
        Scanner sc=new Scanner(System.in);
        String path=sc.next();

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileExample(path);
    }
}
