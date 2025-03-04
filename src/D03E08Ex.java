import java.util.Scanner;

public class D03E08Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Day la nam nhuan: " + year);

        } else {
            System.out.println("Nam khong nhuan");
        }

    }
}
