package LuongIOJava;

import java.io.*;

public class GhiBuffer {
  public static void main(String[] args) {
    /*BufferWriter

    -Lớp này được sử dụng để ghi văn bản vào 1 tệp tin, từng dòng hoặc từng chuỗi.
    -Nếu tệp tin đã tồn tại, nội dung của nó sẽ được thay thế(ghi đè)
    -Có thể sử dụng newLine() để chèn một dấu xuống dòng.
    */

    try(BufferedWriter BW=new BufferedWriter(new FileWriter("data1.txt")))
    {
      BW.write("Dòng 1");
      BW.newLine();
      BW.write("Dòng 2");
      System.out.println("Ghi dữ liệu thành công");
    }
    catch (IOException E)
    {
      System.out.println("Lỗi Ghi File");
    }
  }
}
