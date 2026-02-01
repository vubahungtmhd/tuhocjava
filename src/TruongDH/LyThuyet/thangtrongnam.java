package TruongDH.LyThuyet;

import java.util.Scanner;

public class thangtrongnam {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời nhập tháng: ");
        byte thang;
        thang=sc.nextByte();
        switch (thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+ thang+" Có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng "+thang +" Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+thang+" Có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng "+thang);
                break;
        }
    }
}
