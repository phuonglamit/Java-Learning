import java.util.Scanner;

public class D03E11Ex {
    public static void main(String[] args) {

        // Viết chương trình nhập vào tháng trong năm, cho biết tháng đó thuộc quí mấy
        Scanner sc = new Scanner(System.in);

        // Nhập vào một tháng trong năm
        int month = sc.nextInt();
        sc.close();

        // Tìm xem tháng đó thuộc quý mấy
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("Quý 1");
        }
        else if (month == 4 || month == 5 || month == 6) {
            System.out.println("Quý 2");
        }
        else if (month == 7 || month == 8 || month == 9) {
            System.out.println("Quý 3");

        }
       else if (month == 10 || month == 11 || month == 12) {
            System.out.println("Quý 4");
        } else {
            System.out.println("Tháng nhập vào không hợp lệ");
        }
       

    }

}
