package KieuDanhSach.DanhSachMap;

import java.util.HashMap;

/*
- HashMap lưu trữ dưới dạng cặp Key và value
- Thay vì truy cap bằng index thì sử dụng khóa để truy xuất giá trị tương ứng
- HashMap có thể lưu trữ nhiều tổ hop kiểu dữ liệu khác nhau
- Không duy trì thứ tự của các cặp key/value
*/
public class KieuHashMap {
  public static void main(String[] args) {
    //Tạo 1 hashMap
    HashMap<String,String> capitalCities=new HashMap<>();
    //Thêm mục sử dụng Put()
    capitalCities.put("Việt Nam","Hà Nội");
    capitalCities.put("ThaiLand","BangKok");
    capitalCities.put("India","New Dehli");
    capitalCities.put("USA","Washington DC");
    System.out.println(capitalCities);
    //Truy cập một mục sử dụng get(key) TRUY CAP THONG QUA Key
    capitalCities.get("USA");
    //Xóa 1 mục sử dụng remove(key)
    capitalCities.remove("ThaiLand");
    System.out.println(capitalCities);
    //Xóa tất cả sử dụng Clear()
    /*capitalCities.clear();
    System.out.println(capitalCities);*/
    //Kích thước HashMap
    System.out.println(capitalCities.size());
    //Lặp một HashMap
    //Lặp theo key và lấy giá trị key, ta dùng tên_Map.keySet() để lấy giá trị của key
    for(String i: capitalCities.keySet())
    {
      System.out.println(i);
    }
    //Lặp theo values lấy giá trị value, dùng tênMap.values()
    for(String i:capitalCities.values())
    {
      System.out.println();
    }
  }

}
