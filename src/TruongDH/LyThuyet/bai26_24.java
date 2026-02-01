package TruongDH.LyThuyet;

public class bai26_24 {
  public static void main(String[] args) {
    String path="D:/galailaptrinh/music/remix.mp3";
    //Lấy chuỗi remix.mp3 và chuỗi remix
    int lastSlashIndex=path.lastIndexOf("/");
    System.out.println(lastSlashIndex);
    //remix.mp3
    String fileName=path.substring(lastSlashIndex+1);
    System.out.println(fileName);
    //remix
    int lastDotIndex=fileName.lastIndexOf(".");
    String nameonly=fileName.substring(0,lastDotIndex);
    System.out.println(nameonly);
  }
}
