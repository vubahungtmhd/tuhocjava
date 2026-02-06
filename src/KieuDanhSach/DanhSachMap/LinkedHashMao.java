package KieuDanhSach.DanhSachMap;

import java.util.LinkedHashMap;

/*
- LinkedHashMap:
+ Lưu trữ các cặp Key/Value.
+ Giữ nguyen thứ tự nhập vào.

*/
public class LinkedHashMao {
  public static void main(String[] args) {
    //Tạo 1 LinkedHashMap
    LinkedHashMap<String ,String > capitalCites=new LinkedHashMap<>();
    //Thêm cặp: put()
    capitalCites.put("Việt Nam","Hà Nội");
    capitalCites.put("ThaiLand","BangKok");
    capitalCites.put("Indo","New Dehli");
    capitalCites.put("Japan","Tokyo");
    capitalCites.put("Korea","Seul");
    System.out.println(capitalCites);
    //Truy cập LinkedHashMap()
    System.out.println(capitalCites.get("Việt Nam"));
    //Xóa một mục
    capitalCites.remove("Japan");
    System.out.println(capitalCites);
    //Kích thước của LinkedHashMap()
    System.out.println(capitalCites.size());
    //Duyet theo Key
    System.out.println("Các nước: ");
    for (String key: capitalCites.keySet())
      System.out.println(key);
    //Duyet theo value
    System.out.println("Thủ đô của các nước:");
    for(String val:capitalCites.values())
      System.out.println(val);
  }
}
