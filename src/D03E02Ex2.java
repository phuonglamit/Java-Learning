import java.util.Scanner;

public class D03E02Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Tính chu vi và diện tích hình chữ nhật
         * p = (a+b)*2 >> Chu vi
         * s = a*b >> Diện tích
         */

        // Nhập vào chiều rộng và dài của hình chữ nhật
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Tính chu vi hình chữ nhật
        int p = (a + b) * 2;

        // Tính diện tích hình chữ nhật
        int s = a * b;

        System.out.println("Chu vi hình chữ nhật là:" + p);
        System.out.println("Diện tích hình chữ nhật là:" + s);
        sc.close();
    }

}
