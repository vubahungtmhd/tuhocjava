package LuongJava_Thread;
/*
Hay được sử dụng hơn:
  + Vì có thể đa kế thừa,
  + cách 1 thì sẽ k thể kế thừa thêm
*/

//B1: Kế thừa interface runnable
public class Interface_Runnable implements Runnable {
  //B2: Override phương thức run
  @Override
  public void run() {
    System.out.println("Luồng thread kế thừa Interface Runnable");
  }
}
