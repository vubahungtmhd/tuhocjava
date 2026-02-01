package TruongDH.LyThuyet;

public class Epkieu {
    public static void main(String[] args) {
        //Ep kieu rong
        int a=5;
        int b=10;
        double kq;
        kq=(double)a/b;
        System.out.println("Ket qua la:  "+kq);

        //ep kieu hep
        int c=128;
        byte d=(byte)c;
        System.out.println(c);
        System.out.println(d);
        // Byte tối đa là 127-> bị mất dữ liệu
        int e=15;
        byte f=(byte)e;
        System.out.println(e);
        System.out.println(f);
        // Byte tối đa là 127 -> sẽ không bị mất dữ liệu
    }
}
