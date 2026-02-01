package TruongDH.LyThuyet;

import java.util.HashMap;

public class bai29_hasmap {
  public static void main(String[] args) {
    //Khai báo
    HashMap<Integer,String> map=new HashMap<>();
    HashMap<Integer,Float> map2=new HashMap<>();
    //Thêm vào hasmap
    map.put(1,"Hòa");
    map.put(2,"Chi");
    map.put(3,"Mai");
    map2.put(2,3.5f);
    //Hiển thị giá trị tại key
    String value=map.get(1);
    String value1=map.get(2);
    String value2=map.get(3);
    System.out.println(value);
    System.out.println(value1);
    System.out.println(value2);
    //Xóa phần tử ra khỏi map
    map.remove(2);
    System.out.println(map.get(2));
    //Kiểm tra tồn tại theo key
    boolean check=map.containsKey(3);
    System.out.println(check);
    //Kiểm tra tồn tại theo giá trị
    boolean check2=map.containsValue("Hằng");
    System.out.println(check2);
    //Kiểm tra rỗng
    boolean isEmpty=map.isEmpty();
    System.out.println(isEmpty);
    //Số lượng phần tu
    int nmap=map.size();
    System.out.println(nmap);
    //Duyệt hasmap
    for(Integer key:map.keySet())
    {
      String vl=map.get(key);
      System.out.println(key+" "+vl);
    }
  }
}
