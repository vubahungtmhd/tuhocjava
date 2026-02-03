package BaiTapIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwritter {
  public static void main(String[] args) {
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("NewFolder/test.txt",true)))
    {
      bw.newLine();
      bw.write("Khi tất cả yêu thương trở nên vô nghĩa");
      bw.newLine();
      bw.write("Chúng ta kết thúc thật rồi");
      System.out.println("Ghi dữ liệu thành công");
    }
    catch (IOException e)
    {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}
