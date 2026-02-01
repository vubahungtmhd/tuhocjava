package TruongDH.LyThuyet;

import java.util.Scanner;

public class bai26_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một chuỗi: ");
        String s = sc.nextLine();
        // Khởi tạo biến đếm
        int dem = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demKhoangtrang = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                demInThuong++;
            } else if (Character.isUpperCase(c)) {
                demInHoa++;
            } else if (Character.isDigit(c)) {
                dem++;
            } else if (Character.isWhitespace(c)) {
                demKhoangtrang++;
            }
        }
        System.out.println("Số lượng kí tự thường " + demInThuong);
        System.out.println("Số lượng kí tự hoa " + demInHoa);
        System.out.println("Số lượng khoảng trắng " + demKhoangtrang);
        System.out.println("Số lượng kí tự số " + dem);
    }
}
