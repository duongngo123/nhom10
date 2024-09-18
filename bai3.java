import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            /*
                3.Nhập vào hai số nguyên từ bàn phím.
                Tính tổng, hiệu, tích, thương và phần dư
                của hai số đó. In kết quả ra màn hình.
             */
            int a,b;
            System.out.println("nhap hai so nguyen");
            a= sc.nextInt();
            b= sc.nextInt();
        System.out.println("tong a+b= :"+(a+b));
        System.out.println("tich a*b= :"+(a*b));
        System.out.println("thuong a/b= :"+(a+b));
        System.out.println("chia lay phan du a%b= :"+(a%b));

    }
}
