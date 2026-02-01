package TruongDH.LyThuyet;

public class baicontinue {
    public static void main(String[] args) {
        int tong=0;
        for(int i=0;i<=5;i++){
            if(i==3) continue;// bỏ qua giá trị 3
            tong=tong+i;
        }
        System.out.println("Tổng dãy số khi bỏ qua 3 là:  "+tong);
        int n=0;
        while(n<100)
        {
            System.out.println(n);
            if(n==15) break;
            n++;
        }
    }
}
