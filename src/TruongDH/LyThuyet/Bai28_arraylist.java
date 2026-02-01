package TruongDH.LyThuyet;

import kotlin.ranges.IntRange;

import java.util.*;

public class Bai28_arraylist {
  public static void main(String[] args) {
    //Khai báo list
    ArrayList <Integer> lst=new ArrayList<>();
    //Khai bao với số lượng phần tử
    ArrayList<Integer> lst2=new ArrayList<>(12);
    //Khởi tạo với giá trị ban đầu
    ArrayList<Integer> lst3=new ArrayList<>(List.of(1,2,3,4,5,6));
    //Xuất list
    System.out.println(lst);
    System.out.println(lst2);
    System.out.println(lst3);
    //Phương thức
    //Thêm phần tu add
    ArrayList<Integer> lst4= new ArrayList<>();
    lst4.add(7);
    lst4.add(8);
    lst4.add(11);
    System.out.println("Lst4 mới add: ");
    System.out.println(lst4);
    //add(index,element)
    lst4.add(1,99);
    lst4.add(0,20);
    System.out.println(lst4);
    //size() số phần tử list
    System.out.println("Số phần tử của List 4 là: "+lst4.size());
    //get() trả về giá trị của list ở vị trí index
    System.out.println(lst4.get(3));
    //remove theo vị trí index
    lst4.remove(2);
    System.out.println("Lst4 sau xóa giá trị tại vị trí index là "+lst4);
    //xóa theo giá trị
    ArrayList<Integer> lst5=new ArrayList<>(List.of(1,2,3,4,5,6));
    System.out.println("lst5= "+lst5);
    lst5.remove(Integer.valueOf(3));//xóa số 3
    System.out.println("LST5 sau xóa= "+lst5);
    //thay đổi thông tin theo index
    List<Integer> lst6=new ArrayList<>(List.of(1,2,3,4,5,6));
    lst6.set(2,99);
    System.out.println(lst6);
    //Kiểm tra xem 1 phần tử có tồn tạ tỏng list k
    List<Integer> lst7=new ArrayList<>(List.of(1,2,3,4,5,6));
    boolean kiemtra=lst7.contains(10);//Có chưa giá trị 4 k
    System.out.println(kiemtra);
    //sx tăng giần
    ArrayList<Integer> lst8=new ArrayList<>(List.of(5,2,9,1,24,10));
    Collections.sort(lst8);
    System.out.println("Sau khi sắp xếp là: "+lst8);
    //Tìm vị trí đầu tiên của element trong List
    //Nếu không tồn tại sẽ trả về -1
    ArrayList<Integer> lst9=new ArrayList<>(List.of(9,12,1,3,14,5,8,6));
    System.out.println(lst9.indexOf(3));
    //Duyệt list
    //Cach 1
    ArrayList<Integer> lst10=new ArrayList<>(List.of(9,12,1,3,14,5,8,6));
    System.out.println("-----------------Duyệt theo for---------------------");
    for(int value:lst10)
    {
      System.out.print(value+" ");
    }
    //Cách 2 nếu cần dùng index
    System.out.println("\n--------------Duyệt for theo index---------------");
    for(int i=0;i<lst10.size();i++)
    {
      System.out.print(lst10.get(i)+" ");
    }
  }
}
