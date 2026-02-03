package KieuDanhSach.DanhSachSet;

import java.util.LinkedHashSet;

/*
//LinkedHashSet:
      - Lưu trữ phần tủ theo thứ tự được thêm vào
      - Không cho phép trùng lặp
      - Cho phép một phần tử Null
      - Không có index( đặc trưng của set)

LinkedHashSet: "Đúng thứ tự nhập vào" + "Nhanh";

TreeSet: "Tự động sắp xếp A-Z" + "Ngăn nắp";
*/
public class Bai3_LinkedHashSet {
  public static void main(String[] args) {
    //Khai báo
    LinkedHashSet<String> cars=new LinkedHashSet<String>();
    //Thêm các phần tử
    cars.add("Honda");
    cars.add("Audi");
    cars.add("Lexus");
    cars.add("Toyota");
    cars.add("Mercedes");
    cars.add("Vinfast");
    System.out.println(cars);
    //Kiểm tra tồn tại:
    System.out.println("Mazda tồn tại: "+cars.contains("Mazda"));
    System.out.println("Honda tồn tại: "+cars.contains("Honda"));
    //Xóa một phần tử
    cars.remove("Vinfast");
    System.out.println(cars);
    //Xóa toàn bộ
    //cars.clear();
    //Lặp qua for each
    for (String x:cars)
    {
      System.out.println(x);
    }
  }
}
