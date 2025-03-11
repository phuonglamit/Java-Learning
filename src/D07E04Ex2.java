import java.util.Scanner;

public class D07E04Ex2 {
    public static void main(String[] args) {
        /*
         * Viết ct nhập vào a, nếu a chẵn thì tính tổng 0 đến a
         * Nếu lẻ thì không tính
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        sc.close();
        if (a % 2 != 0) {
            System.out.println("Không tính tổng số lẻ");

        } else {
            for (int i = 0; i <= a; i += 2) {
                sum += i;
            }
            System.out.println("Tổng các số chẵn là: " + sum);
        }
    }

}
