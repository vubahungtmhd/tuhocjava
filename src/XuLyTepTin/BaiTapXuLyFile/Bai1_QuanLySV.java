package XuLyTepTin.BaiTapXuLyFile;

import java.io.File;
import java.io.IOException;

public class Bai1_QuanLySV {
  public static void main(String[] args) {
    //Khai báo file
    File sinhVien=new File("hososinhvien.txt");
    if(sinhVien.exists())
    {
      System.out.println("Thông tin file: ");
      System.out.println("Tên File"+sinhVien.getName());
      System.out.println("Đường dẫn tuyệt đối: "+sinhVien.getAbsolutePath());
      System.out.println("Kích thước file: "+sinhVien.length());
    }
    else
    {
      try
      {
        if(sinhVien.createNewFile())
          System.out.println("Tạo file thành công");
      }
      catch (IOException e)
      {
        System.out.println("File đã tồn tại");
        e.printStackTrace();
      }
    }
  }
}
