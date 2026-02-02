package LuongIOJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class GhiBufferKhongGhiDe {
  public static void main(String[] args) {
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("data1.txt",true)))
    {
      bw.newLine();
      bw.write("Dòng 3");
      bw.newLine();
      bw.write("Dòng 4");
      System.out.println("Ghi dữ liệu thành công");
    }
    catch(IOException e)
    {
      System.out.println("Lỗi Ghi dữ liệu");
    }
  }
}
