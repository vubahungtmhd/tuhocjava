package TruongDH.LyThuyet;

public class bai23_math {
  public static void main(String[] args) {
    System.out.println("pi= "+Math.PI);
    //tri tuyet doi
    int a=-8;
    System.out.println(Math.abs(a));
    //max và min
    System.out.println(Math.max(7,9));
    System.out.println(Math.min(7,9));
    //Căn bậc 2
    System.out.println(Math.sqrt(21));
    //lũy thừa
    System.out.println(Math.pow(2,3));
    //sin cos tan
    int goc=90;
    double sins=Math.sin(Math.PI*goc/180);
    double coss=Math.cos(Math.PI*goc/180);
    double tans=Math.tan(Math.PI*goc/180);
    System.out.println(sins);
  }
}
