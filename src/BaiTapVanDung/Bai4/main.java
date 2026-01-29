package BaiTapVanDung.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    KhuPho k=new KhuPho(new ArrayList<>());
    System.out.println("Nhập số lượng hộ gia đình");
    int soHo=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<soHo;i++)
    {
      System.out.println("Nhập hộ dân thứ "+(i+1));
      System.out.println("Nhập số nhà");
      int soNha1= sc.nextInt();
      sc.nextLine();
      System.out.println("Nhập số thành viên");
      int soLuong1= sc.nextInt();
      sc.nextLine();
      HoGiaDinh hgd=new HoGiaDinh(soNha1,soLuong1);
      for(int j=0;j<soLuong1;j++) {
        System.out.println("Nhập họ và tên: ");
        String hoTen1 = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nghề nghiệp: ");
        String ngheNghiep1 = sc.nextLine();
        String soCMT1;
        while (true)
        {
          System.out.println("Nhập số CMT: ");
          soCMT1 = sc.nextLine();
          if(k.KiemTraCMT(soCMT1))
          {
            System.out.println("Số CMT: "+ soCMT1+" đã tồn tại, vui lòng nhập lại");
          }
          else
           break;//Thoát khỏi vòng for
        }
        Nguoi tv = new Nguoi(hoTen1, tuoi1, ngheNghiep1, soCMT1);
        hgd.themTV(tv);

      }
      k.themCacHo(hgd);
    }
    System.out.println("Thông tin của các hộ");
    k.thongTinKhuPho();
  }
}
//Cần hoàn thiện phần kiểm tra tính duy nhất của Số CMT