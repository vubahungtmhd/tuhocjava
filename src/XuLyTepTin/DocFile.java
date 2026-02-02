package XuLyTepTin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DocFile {
  public static void main(String[] args) {
    File myFile=new File("data1.txt");
    try(Scanner myRead=new Scanner(myFile))
    {
      //Scanner để đọc văn bản nhỏ
      //BufferReader để các tập văn bản lớn
      //FileInputStream để đọc các dữ liệu nhị phân( hình ảnh, âm thanh, PDF...)
      while (myRead.hasNextLine())
      {
        String data=myRead.nextLine();
        System.out.println(data);
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Xuất hiện lỗi");
      e.printStackTrace();
    }
    //Lấy thông tin tệp
    if(myFile.exists())//nếu file tồn tại
    {
      System.out.println("Thông tin file");
      System.out.println("Tên file "+myFile.getName());
      System.out.println("Đường dẫn tuyệt đối: "+myFile.getAbsolutePath());
      System.out.println("Có thể đọc? "+myFile.canRead());
      System.out.println("Có thể ghi? "+myFile.canWrite());
      System.out.println("Độ dài: "+ myFile.length());
    }
    else
      System.out.println("File không tồn tại");
  }
}
