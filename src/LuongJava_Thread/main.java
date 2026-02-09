package LuongJava_Thread;

public class main {
  public static void main(String[] args) {
    //B3: Khởi tạo đối tượng
    KeThuaThread t1=new KeThuaThread();

    //Đặt tên luồng
    t1.setName("Luồng 1");

    //B4: Kích hoạt luồng
    t1.start();


    //Kế thừa Interface Runnable
    //B3: Khởi tạo đối tượng
    //- Khởi tạo công việc
    Interface_Runnable cv=new Interface_Runnable();
    Thread t2=new Thread(cv);
    //B4: Kích hoạt luồng
    t2.start();


    System.out.println("Đây là luồng chính đang thực thi");
  }
}
