import java.util.Scanner;

public class D03E06Ex {
    public static void main(String[] args) {
        /*
         * Tìm 2 số x và y khi biết tổng và hiệu của nó
         * Biết x + y = nhập vào tổng x,y
         * Biết x - y = nhập vào hiệu x,y
         */

        Scanner sc = new Scanner(System.in);

        // Nhập vào tổng x + y
        int sum = sc.nextInt();
        // Nhập vào hiệu x - y (difference_hiệu sô))
        int diff = sc.nextInt();

        // Cách giải: (x + y) + (x - y) = sum + diff =>> 2x = sum + diff =>> x = (sum + diff)/2

        int x = (sum + diff) / 2;
        int y = sum - x;

        // In kết quả
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
