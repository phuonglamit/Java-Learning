import java.util.Scanner;

public class D03E04IfElse {
    public static void main(String[] args) {
        /*
         * if (Điều kiện)
         * Lệnh khi điều kiện đúng
         * else ==> else không bắt buộc phải có
         * Lệnh khi điều kiện sai
         */

        // Khai báo đối tương Scanner
        Scanner sc = new Scanner(System.in);

        // Nhập vào điểm trung bình của học sinh A
        double dtb = sc.nextDouble();

        // Xét điều kiện đậu, rớt (Nếu dtb >= 5 : Đậu, ngược lại : Rớt)
        if (dtb >= 5) {
            System.out.println("Bạn đã đậu, chúc mừng bạn");

        } else {
            System.out.println("Bạn đã rớt!!!");
        }
        sc.close();
    }

}
