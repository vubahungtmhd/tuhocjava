package XuLyTepTin;

import java.io.File;

public class XoaTepTin {
  public static void main(String[] args) {
    //Ta sử dụng phương thức delecte()
    File myFile=new File("data1.txt");
    if(myFile.delete())
    {
      System.out.println("Xóa thành công file"+myFile.getName());
    }
    else
      System.out.println("Xóa thất bại");
    /*
    Có thể dùng phương thức này để xóa cả thư mục nếu:
    - Thư mục trống
    - Truyền vào đường dẫn của thư mục*/
  }
}
