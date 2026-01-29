package BaiTapVanDung.Bai4;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
  private int soLuongThanhVien;
  private int soNha;
  private List<Nguoi> danhSachThanhVien;

  public HoGiaDinh(int soNha,int soLuongThanhVien) {
    this.soNha = soNha;
    this.soLuongThanhVien=soLuongThanhVien;
    this.danhSachThanhVien=new ArrayList<>();
  }

  public void themTV(Nguoi nguoi)
  {
    this.danhSachThanhVien.add(nguoi);
  }

  public List<Nguoi> getDanhSachThanhVien() {
    return danhSachThanhVien;
  }

  public void thongTinHoGiaDinh()
  {
    System.out.println("========================================================");
    System.out.println("Số nhà: "+soNha+" Số lượng thành viên: "+soLuongThanhVien);
    for(Nguoi x: danhSachThanhVien)
    {
      System.out.println(x.toString());
    }
  }
}
