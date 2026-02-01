package TruongDH.LyThuyet;

import java.util.Scanner;

public class toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Mời nhập vào n: ");
//        int n=sc.nextInt();
//        String traloi=(n%2==0)? "Chẵn": "Lẻ";//dúng thì chắn sai thì lẻ
//        System.out.println("So"+n+" la so "+traloi);
        System.out.println("Nhập điểm trung bình: ");
        float dtb=sc.nextFloat();
        String xeploai;
        xeploai=(dtb>=8)?"Giỏi":((dtb>=6.5&&dtb<8)?"Khá":((dtb)<6.5&&dtb>=5)?"Trung bình":"Yếu");
        System.out.println("Học lực "+xeploai);
    }
}
