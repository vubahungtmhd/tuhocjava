package KieuDanhSach.DanhSachMap;

import java.util.TreeMap;
import java.util.TreeSet;

/*
    - TreeMap là tập lưu trữ các cặp key/value
    - Các cặp key/value được sắp xếp theo key
    **/
public class DanhSachTreeMap {
  public static void main(String[] args) {
    //Tạo TreeMap
    TreeMap<String,String> capitalCities=new TreeMap<>();
    //Thêm cặp key/value dùng put(key,value)
    capitalCities.put("Việt Nam","Hà Nội");
    capitalCities.put("ThaiLand","BangKok");
    capitalCities.put("Japan","Tokyo");
    capitalCities.put("Korea","Seul");
    capitalCities.put("England","London");
    System.out.println(capitalCities);
    //Truy cập theo key: Dùng get()
    System.out.println(capitalCities.get("England"));
    //Xóa các mục theo key
    capitalCities.remove("Việt Nam");
    System.out.println(capitalCities);
    //Xoá tất cả
    /*capitalCities.clear();
    System.out.println(capitalCities);*/
    //Kích thước
    System.out.println(capitalCities.size());
    //Lặp theo key
    for (String key: capitalCities.keySet())
    {
      System.out.println(key);
    }
    //Lặp theo value
    for (String val:capitalCities.values())
      System.out.println(val);
  }
}
