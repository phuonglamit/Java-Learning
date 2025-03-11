import java.util.Scanner;

public class D06E02Ex1 {
    /*
     * Nhập n từ bàn phím
     * Chỉ nhận nếu người dùng nhập 1 đến 99
     * Nếu nhập khác số này thì mời nhập lại
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n < 1 || n >= 99) {
            System.out.println("Nhập lại n, n chỉ được từ 1 - 99 thôi");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n = " + n);
        sc.close();

    }

}
