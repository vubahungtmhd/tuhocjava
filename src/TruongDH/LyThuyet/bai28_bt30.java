package TruongDH.LyThuyet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_bt30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Tạo danh sách câu hỏi
        ArrayList<String> quest =new ArrayList<>(List.of(  "2 + 5 + 7 =",
                "5 * 10 =",
                "sqrt(16) =",
                "12%2 ="));

        // Mảng đáp án tương ứng (tự thiết lập)
        double[] answers = {14, 50, 4, 0};

        for (int i = 0; i < quest.size(); i++) {
          System.out.println(quest.get(i));
          System.out.print("nhập kết quả: ");
          double userAns = sc.nextDouble();

          // Kiểm tra đáp án
          if (userAns == answers[i]) {
            System.out.println("Đúng cmn nó luôn!");
          } else {
            System.out.println("Sai lòi mắt cụ ơi, đáp án là: " + answers[i]);
          }
        }
    }
}

