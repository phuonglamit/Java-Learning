import java.util.Scanner;

public class D03E09Ex {
    // Ham check co phai nam nhuan khong
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhap nam
        int year = sc.nextInt();
        // Nhap thang
        int month = sc.nextInt();
        // Xet dieu kien
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang nay co 30 ngay");

        } else if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Thang nay co 31 ngay");

        } else if (month == 2) {
            if (isLeapYear(year)) { // Goi xet nam nhuan
                System.out.println("Thang nay co 29 ngay");
            } else {
                System.out.println("Thang nay co 28 ngay");

            }

        } else {
            System.out.println("Thang khong hop le, vui long nhap tu 1 den 12.");
        }
        sc.close();

    }

}
