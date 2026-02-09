package LuongJava_Thread;

//B1: Kế thừa lớp Thread
public class KeThuaThread extends Thread{
  //Ghi đè phương thức run

  @Override
  public void run() {
    System.out.println("Đây là chương trình đếm số");
  }
}
