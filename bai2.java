import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        /*
              2.Khai báo các biến với các kiểu dữ liệu khác nhau (int, double, char, boolean)
             để lưu trữ thông tin cá nhân của mình (tên, tuổi, chiều cao, có thích lập trình
             không). In ra màn hình các giá trị đã lưu.
        */

        System.out.println("nhap vao ten:");
        String ten= sc.nextLine();
        System.out.println("nhap tuoi");
        int tuoi= sc.nextInt();
        System.out.println("nhap chieu cao");
        double chCao= sc.nextDouble();
        System.out.println("ban co thich lap trinh khong");
        String trloi= new Scanner(System.in).nextLine();
        System.out.println("ten      : "+ten);
        System.out.println("tuoi     : "+tuoi);
        System.out.println("chieu cao: "+chCao);
        System.out.println(trloi+" thich lap trinh");
    }
}
