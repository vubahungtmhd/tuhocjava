package TruongDH.LyThuyet;

public class bai20_xulibietle {
    public static void main(String[] args) {
        try
        {
            int a=10;
            int b=3;
            int c=a/b;
            System.out.println("C= "+c);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Có lỗi toán học");
            ex.printStackTrace();
        }
        catch (Exception ex)
        {
            System.out.println("Có lỗi rồi");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Có lỗi hay không đều phải làm cái này: ");
        }
        System.out.println("Đoạn code phía sau");
    }
}
