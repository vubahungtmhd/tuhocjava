package TinhDaHinh;

public class test {
  public static void main(String[] args) {
    NhanSu ns1 = new PhoPhong("Trần Thị Hòa","55555","Hải Phòng");
    // Lương Của Phó Phòng
    System.out.println(ns1.tinhLuong(26));
    System.out.println("NS1 Lúc đang làm phó phòng");
    System.out.println(ns1.getTen()+" "+ns1.getCccd());
    //Thay đổi chức vụ sang Trưởng phòng
    ns1=new TruongPhong(ns1.getTen(),ns1.getCccd(),ns1.getQueQuan());
    //Lương của trưởng phòng

    System.out.println("NS1 Lúc đang làm trưởng phòng");
    System.out.println(ns1.getTen()+" "+ns1.getCccd());
    System.out.println(ns1.tinhLuong(26));
  }
}
