package KieuDanhSach.DanhSachSet;

import java.util.Set;
import java.util.TreeSet;

/*
//Java TreeSet:
- Lưu trữ các phần tử theo thứ tự được sắp xếp
- Không cho phép có 1 phần tử null
- Chậm hơn HashSet vì phải so sánh để sắp xếp
 + Cũng k có index
//Khi nào dùng List, Khi nào dùng TreeSet
      +Lưu dữ liệu liên tục và ít khi tìm kiếm:ArrayList.
      +Dữ liệu sắp xếp sẵn và bạn phải tìm kiếm thường xuyên: Dùng TreeSet.

*/
public class Bai2_Tree_Set {
  public static void main(String[] args) {
    //Khai báo
    var cars=new TreeSet<String>();
    //Khởi tạo
    TreeSet<Integer> soNguyen=new TreeSet<>(Set.of(3,4,8,1,23,10,6));
    System.out.println("Danh sách số nguyên là: ");
    System.out.println(soNguyen);
    //Thêm phần tử cars
    cars.add("Audi");
    cars.add("Mercedes");
    cars.add("Toyota");
    cars.add("Honda");
    cars.add("Hyundai");
    cars.add("Lexus");
    //Hien thi
    System.out.println(cars);
    //Kiểm tra tồn tại
    System.out.println(cars.contains("Toyota"));
    //Xóa phần tử
    cars.remove("Honda");
    System.out.println(cars);
    //Kích thước
    System.out.println(cars.size());
    //Duyệt qua for-each
    for(var x:cars)
    {
      System.out.print(x+"\t");
    }

  }
}
