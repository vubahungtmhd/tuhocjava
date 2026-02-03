package KieuDanhSach.DanhSachArrayList.DanhSachArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
- ArrayListđể lưu trữ, truy cập.
- LinkedList thao tác dữ liệu.
- LinkedList có thể dùng tất cả phương thức của List
* */
public class Bai2_LinkedList {
  public static void main(String[] args) {

    //LinkedList<String> cars=new LinkedList<String>();
    var cars=new LinkedList<String>();
    //Thêm phần tử đầu tiên cảu List
    //addFirst()
    cars.addFirst("Lamboghini");
    //Thêm phần tử vào cuối list
    cars.add("Lexus");
    cars.add("Audi");
    cars.add("Toyota");
    //Thêm phần tử cuối
    cars.addLast("Mayback");
    System.out.println(cars);
    //Thay thế phần tử
    cars.set(1,"Mercedes");
    System.out.println(cars);
    //Xóa phần tử
    cars.remove(0);
    System.out.println(cars);
    //Thêm vào vị trị
    cars.add(0,"Huyndai");
    System.out.println(cars);
    //Kích thước
    System.out.println(cars.size());
    /*Xóa tất cả clear
    cars.clear();
    System.out.println(cars)*/;
    //Xoá phần tử đầu tiên
    cars.removeFirst();
    System.out.println(cars);
    //Xóa phần tử cuối
    cars.removeLast();
    System.out.println(cars);
    //Lấy giá trị đầu tiên
    System.out.println("Vị trí đầu tiên: "+cars.getFirst());
    //Lấy giá trị cuối
    System.out.println("Vị trí cuối: "+cars.getLast());
    LinkedList<Integer> soNguyen;
    soNguyen = new LinkedList<Integer>(List.of(1,0,11,2,7,3,5));
    System.out.println("List số nguyên");
    //Duyệt LinkledList
    for(int i=0;i<soNguyen.size();i++)
    {
      System.out.print(soNguyen.get(i)+"\t");
    }
    System.out.println();
    //sắp xếp tăng và duyệt theo for-each

    //Collections.sort(soNguyen);
    soNguyen.sort(null);
    System.out.println("List sau khi sắp xếp");
    for(int x:soNguyen)
    {
      System.out.print(x+"\t");
    }
    System.out.println();
    //sx giảm
    Collections.sort(soNguyen,Collections.reverseOrder());
    System.out.println(soNguyen);
    //Đảo ngược list
    Collections.reverse(soNguyen);
    System.out.println(soNguyen);
  }

}
