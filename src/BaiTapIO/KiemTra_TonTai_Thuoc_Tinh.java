package BaiTapIO;

import java.io.File;

public class KiemTra_TonTai_Thuoc_Tinh {
  public static void main(String[] args) {
    File myFile=new File("TaoFile.txt");
    if(myFile.exists())
    {
      System.out.println("Tên File: "+myFile.getName());
      System.out.println("Có đọc được không: "+myFile.canRead());
      System.out.println("Có ghi được không: "+myFile.canWrite());
      //Có thể set chỉ đọc và chỉ ghi
      System.out.println("Kích thước: "+myFile.length());
      System.out.println("Là File hay không: "+myFile.isFile());

    }
    else
    {
      System.out.println("File không tồn tại");
    }
  }
}
