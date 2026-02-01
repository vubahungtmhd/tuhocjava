package BaiTapVanDung.Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NhaTruong {
  private List<HocSinh> danhSach;

  public NhaTruong() {
    this.danhSach = new ArrayList<>();
  }

  public void ThemHocSinh(HocSinh a)
  {
    this.danhSach.add(a);
  }
  public void HienThiHocSinh()
  {
    System.out.println("Danh sách học sinh: ");
    for(HocSinh x:danhSach)
    {
      System.out.println(x);
    }
  }
  public void SinhVien20Tuoi()
  {
    for(HocSinh a: danhSach)
    {
      if(a.getTuoi()==20)
      {
        System.out.println(a);
      }
    }
  }
  public void Tuoi23oDaNang()
  {
    for(HocSinh a:danhSach)
    {
      if(a.getTuoi()==23&&a.getQueQuan().equalsIgnoreCase("Đà Nẵng"))
      {
        System.out.println(a);
      }
    }
  }
  //Hàm này sử dụng để lấy tên trong họ và tên
  //Ví dụ: Nguyễn Đức Anh- > Anh
  private String LayTen(String ten)
  {
    String s=ten.trim();
    //trim() xóa khoảng trắng đầu cuối
    //Thiếu code xóa khoảng trắng ở giữa, trường hợp nhập ở giữa nhiều khoảng trắng sẽ không đúng, cần hoàn thiện
    //VD: Vũ    Bá Hùng-> lấy    Bá Hùng
    int index=s.lastIndexOf(" ");
      if(index==-1)
        return s;
      else
        return s.substring(index+1);
  }
  public void SapXepDanhSach()
  {
    // 1. Kiểm tra xem danh sách có dữ liệu không
    if (this.danhSach == null || this.danhSach.isEmpty()) return;

    // 2. Sử dụng Collections.sort với biến 'danhSach' (tên bạn đã đặt)
    Collections.sort(this.danhSach, (hs1, hs2) -> {
      String ten1 = LayTen(hs1.getHoTen());
      String ten2 = LayTen(hs2.getHoTen());

      // So sánh tên chính, nếu trùng tên thì so sánh cả họ tên để sắp xếp chính xác hơn
      int compareTen = ten1.compareToIgnoreCase(ten2);
      if (compareTen == 0) {
        return hs1.getHoTen().compareToIgnoreCase(hs2.getHoTen());
      }
      return compareTen;
    });
    System.out.println("Đã sắp xếp theo Tên chính.");
  }


}
