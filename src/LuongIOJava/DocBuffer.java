package LuongIOJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocBuffer {
  public static void main(String[] args) {
    /*//BufferReader và BufferWriter để đọc và ghi văn bản nhanh hơn
    - BufferReader: Đọc văn bản từng dòng với readLine().
    - BufferWriter: Ghi văn bản hiệu quả và thêm dòng mới bằng newLine().
    - Các lớp này thường kết hợp với các lớp khác như
    + FileReader
    + FileWriter
    => Để mở or tạo tệp tin
    => Sau đó, các lớp buffered classes này giúp việc đọc/ghi diễn ra nhanh hơn
    bằng cách sử dụng một bộ nhớ đệm (memory buffer).
    */;
    //Đọc 1 file text
    try(BufferedReader br=new BufferedReader(new FileReader("fileName.txt")))
    {
      String line;
      while((line=br.readLine())!=null)
      {
        System.out.println(line);
      }
    }
    catch (IOException E)
    {
      System.out.println("Lỗi đọc file");
      E.printStackTrace();
    }
  }
}
