package TrinhLap_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TrinhLapIterator {
  public static void main(String[] args) {
    //Tạo 1 arrayList
    ArrayList<String > ngonNgu= new ArrayList<>();
    ngonNgu.add("Java");
    ngonNgu.add("Python");
    ngonNgu.add("C++");
    ngonNgu.add("JavaScrip");
    ngonNgu.add("KotLin");
    //Tạo 1 đối tượng Iterator từ arraylist
    Iterator<String > it=ngonNgu.iterator();
    //-> Gọi con trỏ đứng trước phần tử đầu tiên, và dùng next sẽ trỏ đến phần tử đầu tiên
    //Không thể khởi tạo bằng new Iterator() vì iterator là giao diện, không phải lớp cụ thể
    //Duyệt qua danh sách và xóa phần tử
    while(it.hasNext())
    {
      String s=it.next();
      if(!s.equals("Java"))
        it.remove();
    }
    System.out.println(ngonNgu);
  }
}
