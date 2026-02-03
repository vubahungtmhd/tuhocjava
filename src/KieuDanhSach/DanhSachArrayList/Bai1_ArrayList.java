package KieuDanhSach.DanhSachArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
//list:
   - Là một phần của Java Collection và đại diện cho 1 tập được sắp xếp theo thứ tự:
   - Có thể
      + Truy cập các phần tử theo index.
      + Thêm phần tử trùng lặp (set và map thì không được trùng)
      + List là giao diện nên k khai báo trực tiếp như 1 Object
   - Bao gồm các lớp triển khai
      + ArrayList: Giống như mảng liền kề, và có thể thay đổi kích thước
      + LinkedList:Mỗi phần tử là một đối tượng node. Mỗi node gồm 3 phần
        <Địa chỉ trước> <Dữ Liệu> <Địa chỉ sau>
        Dễ dàng chèn và xóa.
   - Các phương thức:
       + Thêm vào cuối:  tenlist.add()
       + Vị trị:  tenlist.get(value)-> vị trí index
       + Thay thế: tenlist.get()
       + Xóa: tenlist.remove()
       + kích thước: tenlist.size()
    -               Mảng                      |            List
       ---------------------------------------|---------------------------------
       Không thể thay đổi kích thước          | Kích thước động
       Không phải một phần của Collection     | Là một phần của Collection
       Hiệu xuất nhanh với dữ liệu thô        | Có nhiều tính năng hơn
- Sắp xếp một ArrayList
+ Lớp Collections: có phương thức sort để sắp xếp danh sách theo số hoặc bảng chữ cái

*/
public class Bai1_ArrayList {
  public static void main(String[] args) {
    //Khai báo List
    ArrayList<Integer> soNguyen=new ArrayList<>();
    //Thêm phần tử vào cuối
    //add
    soNguyen.add(5);
    soNguyen.add(2);
    soNguyen.add(7);
    soNguyen.add(1);
    soNguyen.add(4);
    soNguyen.add(6);
    //Hiển thị danh sách chỉ cần in trực tiếp tên
    System.out.println(soNguyen);
    //Thêm vào vị trí có sẵn add(index,value)
    soNguyen.add(3,3);
    System.out.println(soNguyen);
    //Truy cập một phần tử get
    int val=soNguyen.get(4);
    System.out.println(val);
    //Thay đổi phần tử set(index,value)
    soNguyen.set(4,100);
    System.out.println(soNguyen);
    //Xóa phần tử remove(index)
    soNguyen.remove(5);
    System.out.println(soNguyen);
    //Kích thước List
    System.out.println("Mảng có kích thước: "+soNguyen.size());
    /*//Xóa tất cả clear()
    soNguyen.clear();
    System.out.println(soNguyen)*/;
    //Lặp qua list ta lặp tương tự mảng:
    //Lặp qua index
    System.out.println("Duyệt mảng theo index");
    for(int i=0;i<soNguyen.size();i++)
    {
      System.out.print(soNguyen.get(i)+"\t");
    }
    System.out.println();
    //Duyệt theo for-each
    System.out.println("Duyệt mảng theo for-each");
    for(int x:soNguyen)
    {
      System.out.print(x+"\t");
    }
    System.out.println();
    //Sắp xếp mảng: Collections.sort(Tên Lists);
    Collections.sort(soNguyen);
    System.out.println("Danh sách sau sắp xếp là: ");
    for(int x: soNguyen)
    {
      System.out.print(x+"\t");
    }
    System.out.println();
    //Có thể khai báo list bằng var từ java 10
    var mangString= new ArrayList<String>();
    mangString.add("Hoa\t");
    mangString.add("Mai\t");
    mangString.add("Huế\t");
    mangString.add("Lan\t");
    mangString.add("Hằng\t");
    mangString.add("Kanna\t");
    System.out.println(mangString);
  }

}
