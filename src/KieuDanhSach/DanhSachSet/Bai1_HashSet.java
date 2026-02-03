 /*n
 - Set là một phần của Collection
 - Set không cho các phần tử trùng lặp
 - Thứ tự các phần tử
 + HashSet: Nhanh, không có trật tự
 + TreeSet: Tập hợp đã sắp xếp
 + LinkedHashSet: Được sắp xếp theo thứ tự chèn
 - Set dùng được tất cả phương thức của Collections
 - Nhưng: Set không thể truy cập theo index
 */
//HashSet
 /*
- HashSet:
       + Một phần của Collection
       + Không cho phép trùng lặp
       + Không truy cập được theo index
       + Cho phép có 1 phần tử Null

 */

package KieuDanhSach.DanhSachSet;

 import java.util.HashSet;

 public class Bai1_HashSet {
  public static void main(String[] args) {
    //Khai báo
    //HashSet<String> cars=new HashSet<>();
    var cars=new HashSet<String>();
    //Thêm phần tử
    cars.add("Mercedes");
    cars.add("Toyota");
    cars.add("Honda");
    cars.add("Lexus");
    cars.add("Mayback");
    cars.add("Audi");
    //Nếu ta thêm 1 cái trùng thì nó k báo lỗi mà chỉ "Lờ" đi thôi
    //cars.add("Honda");
    System.out.println("Danh sách xe ô tô: ");
    System.out.println(cars);
    //Kiểm tra tồn tại
    System.out.println(cars.contains("Toyota"));//true là tồn tại/ false là không
    //Xóa phần tử
    //Vì không có index nên chỉ có thể xóa giá trị
    cars.remove("Honda");
    System.out.println(cars);
    //Kích thước
    System.out.println(cars.size());
    //Duyệt hashset thì dùng for:each vì k có index
    for(String x: cars)
      System.out.println(x);

  }
}
