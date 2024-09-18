import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /*
             1.	Tính toán lãi suất ngân hàng:
                •	Nhập vào số tiền gửi, lãi suất hàng năm và số tháng gửi.
                •	Tính số tiền lãi và số tiền gốc cuối kỳ.
                •	In kết quả ra màn hình.
        */
        System.out.println("so tien ban da gui:");
        double gui= sc.nextDouble();
        System.out.println("lai suat hang nam");
        double laiSuat= sc.nextDouble();
        System.out.println("so thang gui");
        int thang= sc.nextInt();
        double lai= gui*laiSuat*((double) (thang*30)/365);
        System.out.println("so tien lai ban nhan duoc la: "+ lai);

    }
}
